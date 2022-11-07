package Projects.Classes.ClassesAttributes.ClassesMultipleObjects;

public class Main {
    int number = 5;

    public static void main(String[] args) {
        Main myObject1 = new Main();  // Object 1
        Main myObject2 = new Main();  // Object 2
        myObject2.number = 25;
        System.out.println(myObject1.number);  // Outputs 5
        System.out.println(myObject2.number);  // Outputs 25
    }
}
