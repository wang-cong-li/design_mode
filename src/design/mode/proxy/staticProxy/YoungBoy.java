package design.mode.proxy.staticProxy;

import design.mode.proxy.Person;

public class YoungBoy implements Person {
    public void findLove() {System.out.println("要求肤白貌美大长腿。。");

        System.out.println("相亲中。。。双方确认是否符合对象条件");

    }

    @Override
    public void findJob() {
        System.out.println("要求月薪40K以上，不加班");
    }
}
