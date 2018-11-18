package design.mode.singletone.eumn;

public class SingleToneEnumTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(SingleToneEnum.getInstance());
            }).start();
        }
    }
}
