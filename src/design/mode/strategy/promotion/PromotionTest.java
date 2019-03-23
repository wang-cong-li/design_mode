package design.mode.strategy.promotion;

public class PromotionTest {
    public static void main(String[] args) {
        PromotionActivity p618 = new PromotionActivity("618");
        p618.doPromotion(new CashBackPromotionStrategy(100),200);

        PromotionActivity double11 = new PromotionActivity("双11");
        double11.doPromotion(new BuyOneGiveOnePromotionStrategy(),300);
        // 扩展策略，只需要新增一个促销策略类，比如新增一个打折策略
        double11.doPromotion(new DiscountPromotionStrategy(0.7),400);
    }
}
