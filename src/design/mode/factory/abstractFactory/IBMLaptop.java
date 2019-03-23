package design.mode.factory.abstractFactory;

public class IBMLaptop implements Laptop {
    @Override
    public Laptop getLaptop() {
        System.out.println("IBM电脑，大佬最爱");
        return this;
    }
}
