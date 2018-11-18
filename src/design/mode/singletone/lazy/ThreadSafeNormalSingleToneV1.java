package design.mode.singletone.lazy;

/**
 * 简单单利的升级版
 * 给方法加了个全局锁
 * 线程安全实现，但是由于加锁导致执行效率低，约为饿汉式的1/7000
 */
public class ThreadSafeNormalSingleToneV1 {
    private ThreadSafeNormalSingleToneV1(){}

    private static ThreadSafeNormalSingleToneV1 INSTANCE;

    public static synchronized ThreadSafeNormalSingleToneV1 getInstance(){
        if (null == INSTANCE) {
            INSTANCE = new ThreadSafeNormalSingleToneV1();
        }
        return INSTANCE;
    }
}
