package design.mode.factory.abstractFactory;

public class ApplePhone implements Phone {
    @Override
    public Phone getPhone() {
        System.out.println("苹果手机，可以出去装逼");
        return this;
    }
}
