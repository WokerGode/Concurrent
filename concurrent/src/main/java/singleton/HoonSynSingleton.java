package singleton;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 23:16 2019/10/27
 * @Modified By: 同步策略 + 懒汉模式
 * 线程同样不安全
 * 性能不好
 * 使用懒加载策略
 */
public class HoonSynSingleton {

    private static HoonSynSingleton instance =null;

    private HoonSynSingleton(){}

    private synchronized static HoonSynSingleton getInstance(){
        if (instance == null) {
            instance = new HoonSynSingleton();
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
