package design.mode.factory.simpleFactory;

import design.mode.factory.ICourse;
import design.mode.factory.JavaCourse;
import design.mode.factory.PythonCourse;

/**
 * 简单工厂模式
 * 用户需要传入准确的参数，才能得到自己想要的产品
 * 工厂职责过重，需要生产各种产品，职责不单一
 * 如果添加一种新产品，需要修改代码，不符合开闭原则
 */
public class SimpleCourseFactory {

    /**
     * 根据课程名称来创建课程
     * 当课程名称传错，返回null对象，此时调用对象的listen听课方法可能会抛出空指针异常
     * @param name
     * @return
     */
    public ICourse getCourse(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        }
        return null;
    }

    /**
     * 根据课程class全限定名来创建课程对象
     *      * 当课程全限定名传错，返回null对象，此时调用对象的listen听课方法可能会抛出空指针异常
     *      * @param name
     *      * @return
     * @param classFullName
     * @return
     */
    public ICourse getCourseByClassFullName(String classFullName) {
        if(null == classFullName || "".equals(classFullName.trim())) {
            return null;
        }
        try {
            Class clazz = Class.forName(classFullName);
            return (ICourse) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据课程Class对象来创建课程
     * 这种方法可以一定程度上避免参数传错问题,
     * 但是如果传入的class对象不是ICourse的实现类或者是null的情况，
     * 仍然是有风险的
     * @param clazz
     * @return
     */
    public ICourse getCourseByClass(Class<?> clazz) {
        try {
            if (null != clazz && ICourse.class.isAssignableFrom(clazz)) {
                return (ICourse) clazz.newInstance();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
