package design.mode.singletone.lazy;

/**
 * 推荐使用这种单利模式
 * 静态内部类实现懒汉式单例模式
 * 线程安全，效率较高
 * 内部类在类加载的时候不初始化，资源占用相对较小
 */
public class InnerStaticClassSingletone {
    private InnerStaticClassSingletone(){}

    public static InnerStaticClassSingletone getInstance() {
        return SingreToneHolder.INSTANCE;
    }

    private static final class SingreToneHolder{
        private SingreToneHolder(){}
        private static final InnerStaticClassSingletone INSTANCE = new InnerStaticClassSingletone();
    }
}
