package design.mode.decorator.pancake;

public class SausagePancakeDecorator extends Pancake {
    private Pancake pancake;

    public SausagePancakeDecorator(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + "加1根香肠";
    }

    @Override
    public double getPrice() {
        return pancake.getPrice() + 4;
    }
}
