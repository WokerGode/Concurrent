package singleton;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 23:11 2019/10/27
 * @Modified By:懒汉式单列模式
 * 线程不安全
 * 性能优化
 * 使用了懒加载
 */
public class HoonSingleton {
    private static HoonSingleton instance =null;

    private HoonSingleton(){}

    private static HoonSingleton getInstance(){
        if (instance == null) {
             instance = new HoonSingleton();
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
