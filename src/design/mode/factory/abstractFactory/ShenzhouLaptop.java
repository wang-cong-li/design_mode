package design.mode.factory.abstractFactory;

public class ShenzhouLaptop implements Laptop {
    @Override
    public Laptop getLaptop() {
        System.out.println("神州电脑，屌丝首选");
        return this;
    }
}
