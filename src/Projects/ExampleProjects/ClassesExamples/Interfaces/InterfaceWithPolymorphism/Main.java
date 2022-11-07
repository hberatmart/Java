package Projects.ExampleProjects.ClassesExamples.Interfaces.InterfaceWithPolymorphism;

public class Main {
    public static void main(String[] args) {
        CustomerManagerForInterface customerManager = new CustomerManagerForInterface(new MySqlCustomerDal());
        customerManager.add();

    }
}
