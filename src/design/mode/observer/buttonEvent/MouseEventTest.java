package design.mode.observer.buttonEvent;

public class MouseEventTest
{
    public static void main(String[] args) {

        MouseEventListener listener = new MouseEventListener() {
            @Override
            public void onEvent(ButtonEvent event) {

                switch (event){
                    case CLICK:
                        System.out.println("click");
                        break;
                        default:
                            System.out.println("default");
                }

            }
        };
        Mouse mouse = new Mouse(listener);
        mouse.click();

    }
}
