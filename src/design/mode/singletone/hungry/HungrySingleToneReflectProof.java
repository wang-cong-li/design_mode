package design.mode.singletone.hungry;

/**
 * 饿汉式单利模式，在类加载的时候就初始化了，并且初始化后的实例将会一直存在，
 * 而并一定会被用到，所以这种方式有资源浪费的嫌疑
 * 这个是线程安全的
 */
public class HungrySingleToneReflectProof {
    private boolean isInitliazed = false;
    private HungrySingleToneReflectProof(){
        if (isInitliazed) {
            throw new IllegalStateException("单利被侵犯！！");
        }
        isInitliazed = true;
    }

    // 饿汉式加载
    private static final HungrySingleToneReflectProof INSTANCE = new HungrySingleToneReflectProof();

    public static final HungrySingleToneReflectProof getInstance() {
        return INSTANCE;
    }


}
