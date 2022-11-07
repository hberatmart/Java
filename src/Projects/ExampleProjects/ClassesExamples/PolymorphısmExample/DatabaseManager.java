package Projects.ExampleProjects.ClassesExamples.PolymorphısmExample;

public class DatabaseManager {
    private DatabaseNameProvider databaseNameProvider;
    DatabaseManager(DatabaseNameProvider databaseNameProvider) {
        this.databaseNameProvider = databaseNameProvider;
    }

    void printDatabaseName() {
        System.out.println(databaseNameProvider.getName());
    }
}
