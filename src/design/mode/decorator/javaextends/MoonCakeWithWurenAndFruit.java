package design.mode.decorator.javaextends;

/**
 * 如果需要五仁+果酱复合口味的月饼
 * 那么需要继承五仁月饼，然后添加果酱
 * 或
 * 继承果酱月饼，添加五仁
 */
public class MoonCakeWithWurenAndFruit extends FruitMoonCake {
    @Override
    public String getDesc() {
        return super.getDesc() + "添加五仁";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }
}
