package Projects.ExampleProjects.ClassesExamples.Interfaces.InterfaceDemo;

public class Worker implements IWorkable, IEatable, IPayable{

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void pay() {
        System.out.println("pay");
    }

    @Override
    public void work() {
        System.out.println("work");
    }
}
