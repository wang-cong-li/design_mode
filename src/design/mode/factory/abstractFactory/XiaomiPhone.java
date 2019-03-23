package design.mode.factory.abstractFactory;

public class XiaomiPhone implements Phone {
    @Override
    public Phone getPhone() {
        System.out.println("小米手机，性价比无敌");
        return this;
    }
}
