package design.mode.proxy.my;
import design.mode.proxy.Person;
import java.lang.reflect.Method;
import design.mode.proxy.my.MyInvocationHandler;
public class $Proxy0 implements design.mode.proxy.Person{
MyInvocationHandler h;
public $Proxy0(MyInvocationHandler h) {
this.h = h;
}
public void findLove() {
try {
this.h.invoke(this,Class.forName("design.mode.proxy.Person").getMethod("findLove"),null);
} catch(Throwable e){
e.printStackTrace();}
}
public void findJob() {
try {
this.h.invoke(this,Class.forName("design.mode.proxy.Person").getMethod("findJob"),null);
} catch(Throwable e){
e.printStackTrace();}
}
}