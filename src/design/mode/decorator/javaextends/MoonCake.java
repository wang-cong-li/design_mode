package design.mode.decorator.javaextends;

/**
 * 我们先使用Java的单继承来模拟不同口味月饼的扩展
 */
public class MoonCake {

    private String desc;

    private double price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
