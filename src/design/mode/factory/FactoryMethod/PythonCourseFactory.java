package design.mode.factory.FactoryMethod;

import design.mode.factory.ICourse;
import design.mode.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse getCourse() {
        return new PythonCourse();
    }
}
