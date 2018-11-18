package design.mode.factory.simple;

import design.mode.factory.Milk;
import design.mode.factory.TeLunSuMilk;
import design.mode.factory.YiLiMilk;

public class SimpleMilkFactory {
    public Milk getMilk(String name) {
        if ("特仑苏".equals(name)) {
            return new TeLunSuMilk();
        } else if("伊利".equals(name)) {
            return new YiLiMilk();
        }
        return null;
    }
}
