package design.mode.proxy.dynamicProxy;

import design.mode.proxy.Person;

public class YoungMan implements Person {
    @Override
    public void findLove() {
        System.out.println("小伙相亲");
    }

    @Override
    public void findJob() {
        System.out.println("小伙面试");
    }
}
