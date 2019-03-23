package design.mode.factory.FactoryMethod;

import design.mode.factory.ICourse;
import design.mode.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse getCourse() {
        return new JavaCourse();
    }
}
