package design.mode.factory.simpleFactory;


public class Test {
    public static void main(String[] args) {
        // 简单工厂模式，俗称小作坊式的工厂模式
        // 产品不够标准化，是定制式的
        SimpleMilkFactory factory = new SimpleMilkFactory();
        System.out.println(factory.getMilk("特仑苏"));
    }
}
