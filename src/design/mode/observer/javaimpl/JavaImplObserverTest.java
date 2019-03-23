package design.mode.observer.javaimpl;

public class JavaImplObserverTest {
    public static void main(String[] args) {
        Student s = new Student();
        Problem p = new Problem();
        p.setUserName("小明");
        p.setContent("设计模式使用场景");
        Teacher t = new Teacher();
        s.addObserver(t);
        s.publishProblem(p);
    }
}
