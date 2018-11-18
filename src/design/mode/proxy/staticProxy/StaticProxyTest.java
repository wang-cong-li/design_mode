package design.mode.proxy.staticProxy;

/**
 * 静态代理----代理对象一定要持有被代理对象的引用，代理工作完成后，需要被代理对象最终做出决定
 * 缺点：被代理对象知道要代理的业务方法，但是一旦业务方法有变动，就需要修改代理对象以应对业务方法改动，不灵活
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        YoungBoy boy = new YoungBoy();
        MeipoProxy meipo = new MeipoProxy(boy);
        meipo.findLove();

        LietouProxy lieTou = new LietouProxy(boy);
        lieTou.findJob();
    }
}
