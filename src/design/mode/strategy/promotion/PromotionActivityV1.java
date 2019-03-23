package design.mode.strategy.promotion;

import java.util.ArrayList;
import java.util.List;

public class PromotionActivityV1 {

    private String name;

    private List<PromotionStrategy> strategies = new ArrayList<>();

    public PromotionActivityV1(String name) {
        this.name = name;
    }

    public void addStrategy(PromotionStrategy strategy){
        this.strategies.add(strategy);
    }

    public boolean remove(PromotionStrategy strategy) {
        return this.strategies.remove(strategy);
    }

    public List<PromotionStrategy> getStrategies() {
        return strategies;
    }

    public void doPromotion(String strategyKey,double
                             price) {
        PromotionStrategy strategy = StrategyFactory.getPromotionStrategy(strategyKey);
        System.out.println(this.name + "促销策略：" + strategy.getName() );
        strategy.promotion(price);
    }
}
