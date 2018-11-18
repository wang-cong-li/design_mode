package design.mode.singletone.lazy;

public class ThreadSafeNormalSingleToneV2Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(ThreadSafeNormalSingleToneV2.getInstance());
            }).start();
        }
    }
}
