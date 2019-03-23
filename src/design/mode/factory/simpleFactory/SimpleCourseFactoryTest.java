package design.mode.factory.simpleFactory;

import design.mode.factory.ICourse;
import design.mode.factory.JavaCourse;
import design.mode.factory.PythonCourse;

public class SimpleCourseFactoryTest {
    public static void main(String[] args) {
        SimpleCourseFactory scf = new SimpleCourseFactory();
//        scf.getCourse("java").listen();
//        scf.getCourse("python").listen();
//        scf.getCourse("bigdata").listen();
//        scf.getCourseByClassFullName("design.mode.factory.JavaCourse").listen();
//        scf.getCourseByClassFullName("design.mode.factory.PythonCourse").listen();
//        scf.getCourseByClassFullName("").listen();

        System.out.println(ICourse.class.isAssignableFrom(JavaCourse.class));
        scf.getCourseByClass(JavaCourse.class).listen();
        scf.getCourseByClass(PythonCourse.class).listen();
//        scf.getCourseByClass(null).listen();
        scf.getCourseByClass(SimpleCourseFactoryTest.class).listen();
    }
}
