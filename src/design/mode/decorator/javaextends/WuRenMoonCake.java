package design.mode.decorator.javaextends;

/**\
 * 使用继承的方式来实现五仁口味的月饼
 */
public class WuRenMoonCake extends MoonCake {

    @Override
    public String getDesc() {
        return super.getDesc() + "添加五仁";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }

}
