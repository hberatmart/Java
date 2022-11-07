package Projects.ExampleProjects.ClassesExamples.Interfaces.InterfaceWithPolymorphism;

public class SqlServerCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("Sql server added");
    }
}
