package design.mode.factory.FactoryMethod;

public class Test {
    public static void main(String[] args) {
        // 标准化成都提高了
        // 用户选择困难，不知道谁好谁坏
        // 一般会引入配置，容易配置错
        MilkFactory factory = new TeLunSuFactory();
        System.out.println(factory.getMilk());
    }
}
