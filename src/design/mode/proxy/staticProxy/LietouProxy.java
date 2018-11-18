package design.mode.proxy.staticProxy;

public class LietouProxy {
    private YoungBoy boy;

    public LietouProxy(YoungBoy boy) {
        this.boy = boy;
    }

    public void findJob() {
        System.out.println("查找合适的招聘机会。。");
        System.out.println("安排面试");
        boy.findJob();
        System.out.println("满意否？去上班？？");
    }
}
