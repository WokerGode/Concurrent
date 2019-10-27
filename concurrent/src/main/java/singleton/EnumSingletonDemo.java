package singleton;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 0:19 2019/10/28
 * @Modified By:
 * 结合了懒加载,懒汉式
 */
public class EnumSingletonDemo {

    private enum EnumSingle{
        INSTANCE;
        private EnumSingletonDemo instance;
        EnumSingle(){
            this.instance = new EnumSingletonDemo();
        }
        private EnumSingletonDemo getInstance(){
            return instance;
        }

    }


    public static EnumSingletonDemo getInstance(){
        return EnumSingle.INSTANCE.getInstance();
    }
}
