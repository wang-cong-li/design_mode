package design.mode.singletone.lazy;

import design.mode.singletone.hungry.HungrySingleTone;

public class InnerStaticClassSingletoneTest {
    public static void main(String[] args) {
        // thread safe test
//        for (int i = 0; i < 100; i++) {
//            new Thread(()->{
//                System.out.println(InnerStaticClassSingletone.getInstance());
//            }).start();
//        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            HungrySingleTone.getInstance();
        }

        System.out.println(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            InnerStaticClassSingletone.getInstance();
        }
        System.out.println(System.currentTimeMillis() - startTime);

    }
}
