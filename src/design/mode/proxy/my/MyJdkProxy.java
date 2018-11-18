package design.mode.proxy.my;


import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyJdkProxy {

    private static final String RN = "\r\n";

    public static Object newProxyInstance(MyClassLoader classLoader, Class[] interfaces, MyInvocationHandler h) throws Exception{
        // 生成代理类java代码并写到一个位置
        String src = generateSrc(interfaces);
        String classpath = MyJdkProxy.class.getResource("").getPath() + "$Proxy0.java";
        File f = new File(classpath);
        FileWriter fileWriter = new FileWriter(classpath);
        fileWriter.write(src);
        fileWriter.flush();
        fileWriter.close();
        // 编译java代码成class文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
        Iterable iterable = manager.getJavaFileObjects(f);
        JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
        task.call();
        manager.close();
        // 使用classLoader加载class文件到JVM
//        MyClassLoader classLoader1 = new MyClassLoader();
        Class clazz = classLoader.findClass("$Proxy0");
        Constructor constructor = clazz.getConstructor(MyInvocationHandler.class);
        // 反射获取代理类示例
        return constructor.newInstance(h);
    }

    private static String generateSrc(Class[] interfaces) {
        if(null == interfaces) {
            return null;
        }
        Class interfaceClass = interfaces[0];

        StringBuilder sb = new StringBuilder();
        sb.append("package design.mode.proxy.my;" + RN);
        sb.append("import " + interfaceClass.getName() + ";" +RN);
        sb.append("import java.lang.reflect.Method;" +RN);
        sb.append("import design.mode.proxy.my.MyInvocationHandler;" +RN);
        sb.append("public class $Proxy0 implements " + interfaceClass.getName() + "{" + RN);

            sb.append("MyInvocationHandler h;" + RN);

            sb.append("public $Proxy0(MyInvocationHandler h) {" + RN)
                .append("this.h = h;" + RN)
                .append("}" + RN);

        Method[] methods = interfaceClass.getMethods();
        for (Method m:methods) {
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + RN)
                        .append("try {" + RN)
                            .append("this.h.invoke(this," + "Class.forName(\""+ interfaceClass.getName()+"\").getMethod(\"" + m.getName() + "\")" + ",null);" + RN)

                        .append("} catch(Throwable e){" + RN)
                        .append("e.printStackTrace();")
                        .append("}" + RN)
                    .append("}" + RN);
        }
        sb.append("}");
        return sb.toString();

    }

}
