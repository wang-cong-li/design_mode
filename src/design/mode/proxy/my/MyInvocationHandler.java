package design.mode.proxy.my;

import java.lang.reflect.Method;

public interface MyInvocationHandler {
    Object invoke(Object proxyObj, Method m,Object[] orgs) throws Throwable ;
}
