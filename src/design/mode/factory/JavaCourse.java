package design.mode.factory;

public class JavaCourse implements ICourse {
    @Override
    public ICourse listen() {
        System.out.println("听Java课！");
        return this;
    }
}
