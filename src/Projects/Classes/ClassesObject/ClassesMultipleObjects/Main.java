package Projects.Classes.ClassesMultipleObjects;

public class Main {
    int number = 11;

    public static void main(String[] args) {
        Main myObject1 = new Main(); // Object 1
        Main myObject2 = new Main(); // Object 2
        System.out.println(myObject1.number);
        System.out.println(myObject2.number);

    }
}
