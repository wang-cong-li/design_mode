package design.mode.prototype.shallow;

import java.util.List;

public class ConcretePrototype implements Prototype {
    private String name;

    private int age;

    private List<String> hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * 模拟浅克隆
     * 针对克隆目标对象中的引用类型，浅克隆只是克隆了引用类型对象的地址而非引用类型对象
     * @return
     */
    @Override
    public Prototype clone() {
        ConcretePrototype instance = new ConcretePrototype();
        instance.setAge(this.age);
        instance.setHobbies(this.hobbies);
        instance.setName(this.name);
        return instance;
    }
}
