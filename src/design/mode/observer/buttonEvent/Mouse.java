package design.mode.observer.buttonEvent;

public class Mouse {

    private MouseEventListener mouseEventListener;

    public Mouse(MouseEventListener mouseEventListener) {
        this.mouseEventListener = mouseEventListener;
    }

    public void click() {
        System.out.println("被点击了！");
        mouseEventListener.onEvent(ButtonEvent.CLICK);
    }

    public void blur() {
        System.out.println("失去焦点！");
        mouseEventListener.onEvent(ButtonEvent.BLUR);
    }


    public void over() {
        System.out.println("悬停！");
        mouseEventListener.onEvent(ButtonEvent.OVER);
    }


    public void up() {
        System.out.println("按钮被点击了！");
        mouseEventListener.onEvent(ButtonEvent.UP);
    }

    public void down() {
        System.out.println("按下！");
        mouseEventListener.onEvent(ButtonEvent.DOWN);
    }

    public void move() {
        System.out.println("指针移动！");
        mouseEventListener.onEvent(ButtonEvent.MOVE);
    }

    public void out() {
        System.out.println("按钮离开目标！");
        mouseEventListener.onEvent(ButtonEvent.OUT);
    }
}
