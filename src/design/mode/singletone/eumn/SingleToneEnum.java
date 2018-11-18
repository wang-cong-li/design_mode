package design.mode.singletone.eumn;

import design.mode.singletone.registry.SingleToneTarget;

/**
 * 利用enum类型的类只会加载一次的特点
 * 在enum加载的时候初始化单利变量
 * 其实类似于饿汉式
 */
public  enum SingleToneEnum {
    INSTANCE;

    static {
        singleToneTarget = new SingleToneTarget();
    }

    private static SingleToneTarget singleToneTarget;

    public static SingleToneTarget getInstance() {
        return singleToneTarget;
    }
}
