package design.mode.decorator.pancake;

public class PancakeTest {
    public static void main(String[] args) {
        Pancake cake = new Pancake();
        // 加鸡蛋
        cake = new EggPancakeDecorator(cake);
        // 加香肠
        cake = new SausagePancakeDecorator(cake);
        // 加两个鸡蛋
        cake = new EggPancakeDecorator(cake);
        System.out.println("煎饼有那些料：" + cake.getDesc() + ",价格是：" + cake
        .getPrice());
    }
}
