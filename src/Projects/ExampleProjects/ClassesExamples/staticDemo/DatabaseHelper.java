package Projects.ExampleProjects.ClassesExamples.staticDemo;

public class DatabaseHelper {
    //inner class
    public static class Crud { //Create read update delete
        public static void delete(){
            System.out.println("Delete");
        }

        public static void  update(){
            System.out.println("Update");
        }
    }
    public static class Connection {
        public static void createConnection() {
            System.out.println("Create connection");
        }
    }
}
