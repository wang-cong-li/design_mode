package design.mode.factory.abstractFactory;

public class ApplePhoneFactory implements IFnShiKangFactory {
    @Override
    public Phone producePhone() {
        return new ApplePhone();
    }

    @Override
    public Laptop produceLaptop() {
        return null;
    }
}
