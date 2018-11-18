package design.mode.factory.FactoryMethod;

import design.mode.factory.Milk;
import design.mode.factory.YiLiMilk;

public class YiLiFactory implements MilkFactory {
    @Override
    public Milk getMilk() {
        return new YiLiMilk();
    }
}
