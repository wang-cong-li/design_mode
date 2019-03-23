package design.mode.observer.javaimpl;

import javafx.beans.InvalidationListener;

import java.util.Observable;

public class Student extends Observable {

    public void publishProblem(Problem problem) {
        setChanged();
        notifyObservers(problem);
    }

}
