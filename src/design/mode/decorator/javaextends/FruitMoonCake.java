package design.mode.decorator.javaextends;

/**
 * 使用继承方式实现果酱味的月饼
 */
public class FruitMoonCake extends MoonCake {
    @Override
    public String getDesc() {
        return super.getDesc() + "添加果酱";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }

}
