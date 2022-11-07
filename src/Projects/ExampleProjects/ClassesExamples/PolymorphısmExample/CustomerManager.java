package Projects.ExampleProjects.ClassesExamples.PolymorphısmExample;

public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void add(){

        System.out.println("Customer added");
        this.logger.log("log message");

       /* Bu bağımlı sistemdir kodu geliştirme aşamasında değişikliğe gideceğin vakit zor durumlar yaşatır.
       DataBaseLogger dataBaseLogger = new DataBaseLogger();
        dataBaseLogger.log("Log message");*/
    }
}
