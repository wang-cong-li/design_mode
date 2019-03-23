package design.mode.observer.javaimpl;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Teacher.update");
    }
}
