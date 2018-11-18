package design.mode.singletone.lazy;

import design.mode.singletone.hungry.HungrySingleTone;

public class ThreadSafeNormalSingleToneV1Test {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            new Thread(()->{
//                System.out.println(ThreadSafeNormalSingleToneV1.getInstance());
//            }).start();
//        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            HungrySingleTone.getInstance();
        }

        System.out.println(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            ThreadSafeNormalSingleToneV1.getInstance();
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
