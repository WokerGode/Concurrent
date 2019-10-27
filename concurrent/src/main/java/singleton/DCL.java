package singleton;

import java.net.Socket;
import java.sql.Connection;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 23:18 2019/10/27
 * @Modified By: Double-Check-Locking
 *
 * 线程安全
 * 性能好
 * 使用了懒加载
 * 但是会因为happens-before 导致出现NPE
 *
 */
public class DCL {

    Connection con;
    Socket socket;
    /**
     * 此处加volatile 会进行定位,保证有序性
     */
    private volatile static DCL instance =null;

    private DCL(){

        /**
         *出现NPE问题,假设con ,socket ,instance 在此处赋值,会因为指令重排问题,
         *线程A先执行instance赋值,线程B在进行双重检查时发现instance已经被赋值,于是调用con和socket
         *导致con,socket出现NPE
         */
//        con;
//        socket;
        instance =new DCL();
    }

    private  static DCL getInstance(){
        if (instance == null) {
            synchronized(DCL.class){
                if (instance == null) {
                    instance = new DCL();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(
                    () -> {
                        System.out.println(getInstance());
                    }
            ).start();


        }
    }


}
