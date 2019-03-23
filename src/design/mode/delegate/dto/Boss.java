package design.mode.delegate.dto;

public class Boss {

    public void command(Manager manager){
        System.out.println("老板安排工作给项目经理。。");
        manager.doWork();
    }

}
