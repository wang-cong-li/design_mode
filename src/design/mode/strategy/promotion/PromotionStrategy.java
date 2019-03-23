package design.mode.strategy.promotion;

public interface PromotionStrategy {

    double promotion(double originPrice);

    String getName();
}
