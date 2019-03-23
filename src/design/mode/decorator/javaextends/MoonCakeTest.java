package design.mode.decorator.javaextends;

public class MoonCakeTest {
    public static void main(String[] args) {
        MoonCake moonCake = new WuRenMoonCake();
        moonCake.setPrice(5);
        moonCake.setDesc("月饼皮");
        System.out.println(moonCake.getDesc() + "价格：" + moonCake.getPrice());
        System.out.println("===========================================================");
        MoonCake moonCake1 = new FruitMoonCake();
        moonCake1.setDesc("月饼皮");
        moonCake1.setPrice(5);
        System.out.println(moonCake1.getDesc() + "价格：" + moonCake1.getPrice());
        System.out.println("===========================================================");
        MoonCake moonCakewithfandw = new MoonCakeWithWurenAndFruit();
        moonCakewithfandw.setDesc("月饼皮");
        moonCakewithfandw.setPrice(5);
        System.out.println(moonCakewithfandw.getDesc() + "价格：" + moonCakewithfandw.getPrice());


    }
}
