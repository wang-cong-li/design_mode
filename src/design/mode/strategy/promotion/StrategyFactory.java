package design.mode.strategy.promotion;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class StrategyFactory {

    private static final ConcurrentMap<String,PromotionStrategy> strategyHolder = new ConcurrentHashMap<>();

    static{
        strategyHolder.put(StrategyKey.BUY_ONE_GIVE_ONE,new BuyOneGiveOnePromotionStrategy());
        strategyHolder.put(StrategyKey.CASH_BACK,new CashBackPromotionStrategy(200));
        strategyHolder.put(StrategyKey.DISCOUNT,new DiscountPromotionStrategy(0.5));
    }

    public static PromotionStrategy getPromotionStrategy(String strategyKey) {
        return strategyHolder.get(strategyKey);
    }

    public interface StrategyKey {
        String BUY_ONE_GIVE_ONE = "buyOneGiveOne";
        String CASH_BACK = "cashBack";
        String DISCOUNT = "discount";
    }

}
