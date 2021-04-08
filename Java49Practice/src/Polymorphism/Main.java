package Polymorphism;

public class Main {
    public static void main(String[] args) {
        EmailLogger logger=new EmailLogger();
        logger.Log("log message");
        BaseLoger[]loggers=new BaseLoger[]{new FileLoger(),new EmailLogger(),new DataBaseLoger()};
        for(BaseLoger loggers1:loggers){
            loggers1.log(" it is logged");
            CustomerManager customerManager=new CustomerManager(new DataBaseLoger());
            CustomerManager customerManager1=new CustomerManager(new FileLoger());
            customerManager1.Add();
            customerManager.Add();


        }


    }
}
