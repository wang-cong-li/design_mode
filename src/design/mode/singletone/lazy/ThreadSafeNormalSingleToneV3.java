package design.mode.singletone.lazy;

/**
 * double——check单利模式
 * 线程安全
 * 效率低下
 */
public class ThreadSafeNormalSingleToneV3 {

    private ThreadSafeNormalSingleToneV3(){}

    private static ThreadSafeNormalSingleToneV3 INSTANCE;

    public static ThreadSafeNormalSingleToneV3 getInstance(){
        if(null == INSTANCE) {
            synchronized (ThreadSafeNormalSingleToneV3.class) {
                if(null == INSTANCE) {
                    INSTANCE = new ThreadSafeNormalSingleToneV3();
                }
            }
        }
        return INSTANCE;
    }


}
