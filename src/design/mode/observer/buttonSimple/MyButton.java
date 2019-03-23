package design.mode.observer.buttonSimple;

public class MyButton {


    public void click(ClickListener clickListener) {
        System.out.println(" button clicked");
        clickListener.onClicked();
    }

    interface ClickListener {
        void onClicked();
    }

}
