package design.mode.factory.abstractFactory;

public class FushikangFactory implements IFnShiKangFactory {
    @Override
    public Phone producePhone() {
        return new ApplePhone();
    }

    @Override
    public Laptop produceLaptop() {
        return new IBMLaptop();
    }
}
