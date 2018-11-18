package design.mode.singletone.lazy;

import design.mode.singletone.hungry.HungrySingleTone;

public class ThreadSafeNormalSingleToneV3Test {

    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            new Thread(()->{
//                System.out.println(ThreadSafeNormalSingleToneV3.getInstance());
//            }).start();
//        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            HungrySingleTone.getInstance();
        }

        System.out.println(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            ThreadSafeNormalSingleToneV3.getInstance();
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

}
