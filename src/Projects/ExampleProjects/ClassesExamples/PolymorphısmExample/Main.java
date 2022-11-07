package Projects.ExampleProjects.ClassesExamples.PolymorphısmExample;

public class Main {
    public static void main(String[] args) {
        /*BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DataBaseLogger(), new DataBaseLogger()};
        for(BaseLogger logger : loggers){
            logger.log("Log message");
        }*/

        DataBaseLogger dataBaseLogger = new DataBaseLogger(new Database());
        CustomerManager customerManager = new CustomerManager(dataBaseLogger);
        customerManager.add();


    }

}
