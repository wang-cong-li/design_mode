package design.mode.singletone.registry;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 注册登记式单利模式（Spring Framework的BeanRegistry即这种单利模式）
 * 本身线程并不安全，所以需要加个全局lock来保证线程安全
 */
public class SingleToneRegistry {

    private static ConcurrentMap<String,Object> SingleToneRegistry = new ConcurrentHashMap<>();

    private static ReentrantLock lock = new ReentrantLock();

    public static Object getInstance(String className) {
        try {
            lock.lock();
            Object instance = SingleToneRegistry.get(className);
            if (null == instance) {
                instance = Class.forName(className).newInstance();
                SingleToneRegistry.put(className, instance);
            }
            return SingleToneRegistry.get(className);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return null;
    }

    public static <T> T getInstance(String className,Class<T> clazz) {
        try {
            lock.lock();
            Object instance = SingleToneRegistry.get(className);
            if (null == instance) {
                instance = Class.forName(className).newInstance();
                SingleToneRegistry.put(className,instance);
            }
            return (T)SingleToneRegistry.get(className);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return null;
    }

}
