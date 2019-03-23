package design.mode.factory.abstractFactory;

public class AbstractFactoryTes {
    public static void main(String[] args) {
        IFnShiKangFactory fnShiKangFactory = new FushikangFactory();
        fnShiKangFactory.produceLaptop().getLaptop();
        fnShiKangFactory.producePhone().getPhone();
    }
}
