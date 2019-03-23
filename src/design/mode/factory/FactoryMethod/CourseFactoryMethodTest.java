package design.mode.factory.FactoryMethod;

/**
 * 工厂方法模式
 * 一个工厂只生产一种产品，职责相对比较单一
 * 增加新产品，只需要增加一个实现类，扩展比较方便
 * 缺点是：用户必须知道所有的实现类
 */
public class CourseFactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.getCourse().listen();

        ICourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.getCourse().listen();
    }
}
