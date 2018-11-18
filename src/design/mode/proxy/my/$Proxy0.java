package design.mode.proxy.my;
public final class $Proxy0 implements design.mode.proxy.Person{
    MyInvocationHandler h;
    public $Proxy0(MyInvocationHandler h) {
        this.h = h;
    }
    public final void findJob() {
        try {
            this.h.invoke(this,Class.forName("design.mode.proxy.Person").getMethod("findJob"),null);
        } catch(Throwable e){
            e.printStackTrace();}
    }
    public final void findLove() {
        try {
            this.h.invoke(this,Class.forName("design.mode.proxy.Person").getMethod("findLove"),null);
        } catch(Throwable e){
            e.printStackTrace();}
    }
}