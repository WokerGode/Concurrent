package singleton;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 0:09 2019/10/28
 * @Modified By:holder模式是目前使用较多的单列模式之一
 *  声明类的时候不声明静态变量,而是使用内部类去实现
 * 线程安全
 * 性能好
 * 实现懒加载
 *
 * 静态类加载 init方法保证了唯一,内部类的变量只有在调用的时候才会进行实例化
 */
public class HolderSingleton {

    private static class Holer{

        private static HolderSingleton instance =new HolderSingleton();

    }

    public static HolderSingleton getInstance(){
        return Holer.instance;
    }

}
