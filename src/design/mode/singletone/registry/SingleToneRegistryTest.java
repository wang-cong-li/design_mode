package design.mode.singletone.registry;

public class SingleToneRegistryTest {
    public static void main(String[] args) {
        // thread safe test
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(SingleToneRegistry.getInstance(SingleToneTarget.class.getName()));
            }).start();
        }
    }
}
