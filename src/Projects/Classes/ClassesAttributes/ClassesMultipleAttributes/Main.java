package Projects.Classes.ClassesAttributes.ClassesMultipleAttributes;

public class Main {
    String fname = "Berat";
    String lname = "Mart";
    int age = 24;

    public static void main(String[] args) {
        Main myObject = new Main();
        System.out.println("Full Name: " + myObject.fname + " " + myObject.lname);
        System.out.println("Age: " + myObject.age);
    }
}
