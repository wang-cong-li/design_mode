package design.mode.singletone.serial;

import java.io.Serializable;

/**
 * 通过增加readResolve方法防止序列化和反序列化破坏单利模式
 */
public class SerialSingleToneTargetSerialProof implements Serializable {
    private SerialSingleToneTargetSerialProof(){}

    private static final SerialSingleToneTargetSerialProof INSTANCE = new SerialSingleToneTargetSerialProof();

    public static SerialSingleToneTargetSerialProof getInstance() {
        return INSTANCE;
    }

    public Object readResolve(){
        return INSTANCE;
    }
}
