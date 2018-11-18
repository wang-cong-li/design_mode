package design.mode.singletone.lazy;

public class NormalLazySingleToneTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(NormalLazySingleTone.getInstance());
            }).start();
        }
    }
}
