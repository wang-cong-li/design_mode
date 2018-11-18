package design.mode.proxy.proxyUseMy;

import design.mode.proxy.Person;
import design.mode.proxy.my.MyClassLoader;
import design.mode.proxy.my.MyInvocationHandler;
import design.mode.proxy.my.MyJdkProxy;

import java.lang.reflect.Method;

public class MyJdkProxyDemo implements MyInvocationHandler {

    private Person person;

    public MyJdkProxyDemo(Person person) {
        this.person = person;
    }

    public Object getProxyObject() throws Exception {
        return MyJdkProxy.newProxyInstance(new MyClassLoader(),person.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxyObj, Method m, Object[] orgs) throws Throwable {
        System.out.println("代理进行中");
        System.out.println("代理完成");
        return m.invoke(person,orgs);
    }
}
