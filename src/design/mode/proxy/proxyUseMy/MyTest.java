package design.mode.proxy.proxyUseMy;

import design.mode.proxy.Person;
import design.mode.proxy.dynamicProxy.YoungMan;

public class MyTest {

    public static void main(String[] args) throws Exception {
        MyJdkProxyDemo demo = new MyJdkProxyDemo(new YoungMan());
        Person p = (Person) demo.getProxyObject();
        System.out.println(p.getClass());
        p.findLove();
    }
}
