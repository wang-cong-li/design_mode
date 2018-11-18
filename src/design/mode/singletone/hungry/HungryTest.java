package design.mode.singletone.hungry;

public class HungryTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                HungrySingleTone instance = HungrySingleTone.getInstance();
                System.out.println(instance);
            }).start();
        }

    }
}
