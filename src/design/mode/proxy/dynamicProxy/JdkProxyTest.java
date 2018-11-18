package design.mode.proxy.dynamicProxy;

import design.mode.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 动态代理具体过程;
 * jdk生成对应接口的实现类实现所有接口中的业务方法生成java代码到系统临时目录中
 * 使用JavaCompiler对生成的java代码源文件进行编译，生成class文件
 * 使用classLoader加载class文件到JVM中
 * 反射获取生成的实现类的对象
 * 最后可使用这个代理对象调用业务方法，实现动态代理
 * 生成的java代码如下
 * import design.mode.proxy.Person;
 * import java.lang.reflect.InvocationHandler;
 * import java.lang.reflect.Method;
 * import java.lang.reflect.Proxy;
 * import java.lang.reflect.UndeclaredThrowableException;
 *
 * public final class $Proxy0 extends Proxy implements Person {
 *     private static Method m1;
 *     private static Method m4;
 *     private static Method m2;
 *     private static Method m3;
 *     private static Method m0;
 *
 *     public $Proxy0(InvocationHandler var1) throws  {
 *         super(var1);
 *     }
 *
 *     public final boolean equals(Object var1) throws  {
 *         try {
 *             return (Boolean)super.h.invoke(this, m1, new Object[]{var1});
 *         } catch (RuntimeException | Error var3) {
 *             throw var3;
 *         } catch (Throwable var4) {
 *             throw new UndeclaredThrowableException(var4);
 *         }
 *     }
 *
 *     public final void findLove() throws  {
 *         try {
 *             super.h.invoke(this, m4, (Object[])null);
 *         } catch (RuntimeException | Error var2) {
 *             throw var2;
 *         } catch (Throwable var3) {
 *             throw new UndeclaredThrowableException(var3);
 *         }
 *     }
 *
 *     public final String toString() throws  {
 *         try {
 *             return (String)super.h.invoke(this, m2, (Object[])null);
 *         } catch (RuntimeException | Error var2) {
 *             throw var2;
 *         } catch (Throwable var3) {
 *             throw new UndeclaredThrowableException(var3);
 *         }
 *     }
 *
 *     public final void findJob() throws  {
 *         try {
 *             super.h.invoke(this, m3, (Object[])null);
 *         } catch (RuntimeException | Error var2) {
 *             throw var2;
 *         } catch (Throwable var3) {
 *             throw new UndeclaredThrowableException(var3);
 *         }
 *     }
 *
 *     public final int hashCode() throws  {
 *         try {
 *             return (Integer)super.h.invoke(this, m0, (Object[])null);
 *         } catch (RuntimeException | Error var2) {
 *             throw var2;
 *         } catch (Throwable var3) {
 *             throw new UndeclaredThrowableException(var3);
 *         }
 *     }
 *
 *     static {
 *         try {
 *             m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
 *             m4 = Class.forName("design.mode.proxy.Person").getMethod("findLove");
 *             m2 = Class.forName("java.lang.Object").getMethod("toString");
 *             m3 = Class.forName("design.mode.proxy.Person").getMethod("findJob");
 *             m0 = Class.forName("java.lang.Object").getMethod("hashCode");
 *         } catch (NoSuchMethodException var2) {
 *             throw new NoSuchMethodError(var2.getMessage());
 *         } catch (ClassNotFoundException var3) {
 *             throw new NoClassDefFoundError(var3.getMessage());
 *         }
 *     }
 * }
 */
public class JdkProxyTest {
    public static void main(String[] args) throws IOException {
        Person person = new YoungMan();
        JdkDynamicProxy proxy = new JdkDynamicProxy(person);
        Person p = (Person) proxy.getProxyInstance();
        System.out.println("class:" + p.getClass()); // class com.sun.proxy.$Proxy0
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        FileOutputStream fos = new FileOutputStream("D:\\$Proxy0.class");
        fos.write(bytes);
        fos.flush();
        fos.close();
        p.findLove();
    }
}
