package design.mode.singletone.lazy;

/**
 * 懒汉式单利模式V2，
 * 这个单利模式将锁放到了代码块里面
 * 但是并不能保证线程安全。
 * 并且性能也不咋地
 */
public class ThreadSafeNormalSingleToneV2 {

    private ThreadSafeNormalSingleToneV2(){}

    private static ThreadSafeNormalSingleToneV2 INSTANCE;

    public static ThreadSafeNormalSingleToneV2 getInstance(){
        if(null == INSTANCE) {
            synchronized (ThreadSafeNormalSingleToneV2.class) {
                INSTANCE = new ThreadSafeNormalSingleToneV2();
            }
        }
        return INSTANCE;
    }
}
