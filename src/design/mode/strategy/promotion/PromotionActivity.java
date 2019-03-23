package design.mode.strategy.promotion;

public class PromotionActivity {
    private String name;

    public PromotionActivity(String name) {
        this.name = name;
    }

    public void doPromotion(PromotionStrategy strategy, double price) {
        System.out.println("活动名称：" + this.name + "促销策略:" + strategy.getName());
        strategy.promotion(price);
    }
}
