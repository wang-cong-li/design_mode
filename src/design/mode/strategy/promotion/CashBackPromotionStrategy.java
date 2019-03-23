package design.mode.strategy.promotion;

public class CashBackPromotionStrategy implements PromotionStrategy {

    private String  name = "返现活动" +
            "满200返现100元";

    private double cashLimit;

    public CashBackPromotionStrategy(double cashLimit) {
        this.cashLimit = cashLimit;
    }

    @Override
    public double promotion(double originPrice) {
        System.out.println("参与" + this.name + "返现促销，单笔订单满" + this.cashLimit + "元返现100元。");
        if (originPrice >= this.cashLimit) {
            return originPrice - 100;
        }
        return originPrice;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
