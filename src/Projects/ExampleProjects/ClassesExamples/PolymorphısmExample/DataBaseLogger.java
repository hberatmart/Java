package Projects.ExampleProjects.ClassesExamples.PolymorphısmExample;

public class DataBaseLogger extends BaseLogger implements DatabaseNameProvider {
    private Database database;
    DataBaseLogger(Database database) {
        this.database = database;
    }
    @Override
    public void log(String message){
        System.out.println("Logged to database: " + message);
    }

    @Override
    public String getName() {
        return database.NAME;
    }
}
