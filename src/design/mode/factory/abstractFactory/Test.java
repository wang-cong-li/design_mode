package design.mode.factory.abstractFactory;

public class Test {
    public static void main(String[] args) {
        // 用户只有选择权，不用关心产品的具体生产过程
        // spring中常用抽象工厂模式
        MilkFactory factory = new MilkFactory();
        System.out.println(factory.getTeLunSuMilk());
    }
}
