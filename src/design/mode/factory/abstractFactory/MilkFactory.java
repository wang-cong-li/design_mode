package design.mode.factory.abstractFactory;

import design.mode.factory.FactoryMethod.TeLunSuFactory;
import design.mode.factory.FactoryMethod.YiLiFactory;
import design.mode.factory.Milk;
import design.mode.factory.TeLunSuMilk;
import design.mode.factory.YiLiMilk;

public class MilkFactory extends AbstractMilkFactory {
    @Override
    public Milk getTeLunSuMilk() {
        return new TeLunSuFactory().getMilk();
    }

    @Override
    public Milk getYiLiMilk() {
        return new YiLiFactory().getMilk();
    }
}
