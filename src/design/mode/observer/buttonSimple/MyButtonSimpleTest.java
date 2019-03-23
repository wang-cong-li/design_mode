package design.mode.observer.buttonSimple;

public class MyButtonSimpleTest {
    public static void main(String[] args) {
        MyButton button = new MyButton();
        button.click(new MyButton.ClickListener() {
            @Override
            public void onClicked() {
                System.out.println("处理button点击事件");
            }
        });
    }
}
