package design.mode.prototype.shallow;

import java.util.Date;

public class ClonePrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ClonePrototype clonePrototype = new ClonePrototype();
        clonePrototype.setAge(18);
        clonePrototype.setName("name");
        clonePrototype.setBirthday(new Date());
        ClonePrototype copy = (ClonePrototype)clonePrototype.clone();
        System.out.println(copy == clonePrototype);
        System.out.println(copy.getBirthday() == clonePrototype.getBirthday());
    }
}
