package Polymorphism;

public class CustomerManager {
    private BaseLoger baseLoger;
    public CustomerManager(BaseLoger loger){
        this.baseLoger=loger;
    }
    public void Add(){
        System.out.println("customer added");
        this.baseLoger.log("customer added");
        baseLoger.log("Log message");
    }

}
