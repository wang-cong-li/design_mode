package design.mode.singletone.reflectDamage;

import design.mode.singletone.hungry.HungrySingleTone;
import design.mode.singletone.hungry.HungrySingleToneReflectProof;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDamageTest {

    public static void main(String[] args) {
        try {
            Class clazz = HungrySingleToneReflectProof.class;
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            // 执行结果：false,说明使用反射导致单利被破坏
            System.out.println(constructor.newInstance(null));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
