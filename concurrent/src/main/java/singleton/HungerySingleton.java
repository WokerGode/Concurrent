package singleton;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 23:05 2019/10/27
 * @Modified By:饿汉式单例模式
 * 线程安全
 * 性能不好(消耗内存)
 * 未使用懒加载
 */
public class HungerySingleton {
    private static HungerySingleton instance =new HungerySingleton();

    private HungerySingleton(){}

    private static HungerySingleton getInstance(){

        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(
                    ()->{
                        System.out.println(getInstance());
                    }
            ).start();


        }



    }


}
