package design.mode.decorator.pancake;

public class EggPancakeDecorator extends Pancake {

    private Pancake pancake;

    public EggPancakeDecorator(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + "加1个鸡蛋";
    }

    @Override
    public double getPrice() {
        return pancake.getPrice() + 2;
    }

}
