package design.mode.factory.FactoryMethod;


import design.mode.factory.Milk;
import design.mode.factory.TeLunSuMilk;

public class TeLunSuFactory implements MilkFactory {
    @Override
    public Milk getMilk() {
        return new TeLunSuMilk();
    }
}
