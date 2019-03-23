package design.mode.strategy.promotion;

public class PromotionActivityV1Test {
    public static void main(String[] args) {
        PromotionActivityV1 v1 = new PromotionActivityV1("双12");
        v1.doPromotion(StrategyFactory.StrategyKey.BUY_ONE_GIVE_ONE,500);
    }
}
