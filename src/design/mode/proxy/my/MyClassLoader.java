package design.mode.proxy.my;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String classpath = MyClassLoader.class.getResource("").getPath();
        String className = MyClassLoader.class.getPackage().getName() + "." + name;
        FileInputStream  fis = null;
        ByteArrayOutputStream baos = null;
        try {
            fis = new FileInputStream(classpath + name.replace(".","/") + ".class");
            byte[] buffer = new byte[1024];
            int len = 0;
            baos = new ByteArrayOutputStream();
            while((len = fis.read(buffer)) != -1) {
                baos.write(buffer,0,len);
            }
            byte[] bytes = baos.toByteArray();
            return defineClass(className,bytes,0,bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null!= baos) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null!= fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return super.findClass(name);
    }
}
