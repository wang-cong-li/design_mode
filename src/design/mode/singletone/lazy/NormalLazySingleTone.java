package design.mode.singletone.lazy;

/**
 * 最简单的单例模式---当被调用的时候才实例化
 * 但是线程并不安全
 */
public class NormalLazySingleTone {

    private NormalLazySingleTone() {
    }

    private static NormalLazySingleTone INSTANCE;

    public static NormalLazySingleTone getInstance() {
        if (null == INSTANCE) {
            try{
                Thread.sleep(10);
            } catch (Exception e) {

            }
            INSTANCE = new NormalLazySingleTone();
        }
        return INSTANCE;
    }

}
