package design.mode.prototype.shallow;

import java.util.Date;

/**
 * 直接实现Cloneable接口，重写clone方法，也是浅克隆
 */
public class ClonePrototype implements Cloneable {

    private int age;

    private String name;

    private Date birthday;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 这里直接使用super的clone方法，也是浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    /**
     * 这里实现深克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        ClonePrototype ins = new ClonePrototype();
        ins.setAge(this.age);
        ins.setName(this.name);
        //这里不直接引用this.birthday，而是直接创建一个新的日期对象
        Date d = new Date(this.birthday.getTime());
        ins.setBirthday(d);
        return ins;
    }
}
