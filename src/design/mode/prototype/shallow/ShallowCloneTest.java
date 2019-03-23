package design.mode.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

public class ShallowCloneTest {
    public static void main(String[] args) {
        ConcretePrototype obj = new ConcretePrototype();
        obj.setAge(18);
        obj.setName("wangwu");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("swimming");
        obj.setHobbies(hobbies);

        // 浅拷贝是新建了一个新的ConcretePrototype对象，所以这里是false；
        ConcretePrototype p = (ConcretePrototype)obj.clone();
        System.out.println(p == obj);
        // 浅拷贝：被拷贝的对象里面的引用类型只是拷贝了引用地址，所以这里是true
        System.out.println(p.getHobbies() == obj.getHobbies());


    }
}
