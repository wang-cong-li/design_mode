package design.mode.strategy.promotion;

public class BuyOneGiveOnePromotionStrategy implements PromotionStrategy {

    private String name = "买一送一";

    public String getName() {
        return name;
    }

    @Override
    public double promotion(double originPrice) {
        System.out.println("执行买一送一促销策略");
        return originPrice / 2;
    }
}
