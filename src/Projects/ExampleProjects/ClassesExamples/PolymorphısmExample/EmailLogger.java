package Projects.ExampleProjects.ClassesExamples.PolymorphısmExample;

public class EmailLogger extends BaseLogger{
    @Override
    public void log(String message){
        System.out.println("Logged to email: " + message);
    }
}
