package Projects.ExampleProjects.ClassesExamples.Interfaces.InterfacesClasses;

import Projects.ExampleProjects.ClassesExamples.Interfaces.InterfaceWithPolymorphism.ICustomerDal;
import Projects.ExampleProjects.ClassesExamples.Interfaces.InterfaceWithPolymorphism.MySqlCustomerDal;

public class Main {
    public static void main() {
        ICustomerDal customerDal = new MySqlCustomerDal();
        customerDal.add();
    }
}
