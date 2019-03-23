package design.mode.factory;

public class PythonCourse implements ICourse {
    @Override
    public ICourse listen() {
        System.out.println("听python课程。");
        return this;
    }
}
