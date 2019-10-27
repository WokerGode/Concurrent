package singleton;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 0:15 2019/10/28
 * @Modified By: 枚举只在实例化的时候加载了一次
 * 但是不能保证懒加载,与饿汉式基本相同
 */
public enum  EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
