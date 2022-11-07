package Projects.ExampleProjects.ClassesExamples.Interfaces.InterfaceWithPolymorphism;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle added");
    }
}
