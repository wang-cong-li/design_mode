package design.mode.proxy.dynamicProxy;

import design.mode.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk提供的动态代理
 * 动态代理只有到运行的时候才知道代理的具体业务方法，事先并不知道。
 * 当业务方法改变时，被代理对象自动适配，不需要任何修改，非常灵活
 *
 *
 *
 *
 *
 */
public class JdkDynamicProxy implements InvocationHandler  {

    private Person person;

    public JdkDynamicProxy(Person person) {
        this.person = person;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理工作准备。。。");
        System.out.println("代理工作进行中。。。。。");
        System.out.println("代理工作完成");
        method.invoke(person,args);
        System.out.println("被代理对象反馈决定，代理结束。。");
        return null;
        }
        }
