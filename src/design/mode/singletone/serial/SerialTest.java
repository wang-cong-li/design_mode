package design.mode.singletone.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化和反序列化破坏单利示例
 *
 */
public class SerialTest {

    public static void main(String[] args) {
        try {
            SerialSingleToneTarget target = SerialSingleToneTarget.getInstance();
            FileOutputStream fos = new FileOutputStream("D:\\test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(target);
            oos.flush();
            fos.close();
            oos.close();
            FileInputStream fis = new FileInputStream("D:\\test.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);

            SerialSingleToneTarget targetIn = (SerialSingleToneTarget) objectInputStream.readObject();
            objectInputStream.close();
            fis.close();
            System.out.println(targetIn == target);

            System.out.println("*********************分割线*****************************");

            SerialSingleToneTargetSerialProof target1 = SerialSingleToneTargetSerialProof.getInstance();
            FileOutputStream fos1 = new FileOutputStream("D:\\test1.txt");
            ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
            oos1.writeObject(target1);
            oos1.flush();
            fos1.close();
            oos1.close();
            FileInputStream fis1 = new FileInputStream("D:\\test1.txt");
            ObjectInputStream objectInputStream1 = new ObjectInputStream(fis1);
            SerialSingleToneTargetSerialProof targetIn1 = (SerialSingleToneTargetSerialProof) objectInputStream1.readObject();
            fis1.close();
            objectInputStream1.close();
            System.out.println(targetIn1 == target1);

        }catch (Exception e) {

        }

    }
}
