package Projects.ExampleProjects.ClassesExamples.Abstract.AbstractClassesDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

        ChocolateMaker maker1 = new BitterChocolateMaker();
        ChocolateMaker maker2 = new MilkChocolateMaker();

        maker1.make();
        maker2.make();
    }
}
