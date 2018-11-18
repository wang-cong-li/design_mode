package design.mode.proxy.staticProxy;

public class MeipoProxy {
    private YoungBoy boy;

    public MeipoProxy(YoungBoy boy) {
        this.boy = boy;
    }

    public void findLove(){
        System.out.println("开始物色姑娘。。");
        System.out.println("物色到姑娘。。。安排相亲");
        boy.findLove();
        System.out.println("是否满意？件家长？？？？？");
    }
}
