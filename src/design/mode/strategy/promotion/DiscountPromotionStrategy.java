package design.mode.strategy.promotion;

public class DiscountPromotionStrategy implements PromotionStrategy {

    private String name = "全场打折促销策略";

    private double discount;

    public DiscountPromotionStrategy(double discount) {
        this.discount = discount;
    }

    @Override
    public double promotion(double originPrice) {
        System.out.println("执行打折促销策略。。");
        return originPrice  * this.discount;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
