package design.mode.singletone.serial;

import java.io.Serializable;
import java.nio.channels.ServerSocketChannel;

public class SerialSingleToneTarget implements Serializable {
    private SerialSingleToneTarget(){}

    private static final SerialSingleToneTarget INSTANCE = new SerialSingleToneTarget();

    public static SerialSingleToneTarget getInstance() {
        return INSTANCE;
    }
}
