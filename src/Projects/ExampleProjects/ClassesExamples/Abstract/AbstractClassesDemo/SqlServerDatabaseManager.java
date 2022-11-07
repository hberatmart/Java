package Projects.ExampleProjects.ClassesExamples.Abstract.AbstractClassesDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Data brought: Sql Server");
    }
}
