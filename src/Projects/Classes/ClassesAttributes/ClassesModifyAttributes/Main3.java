package Projects.Classes.ClassesAttributes.ClassesModifyAttributes;

public class Main3 {
     final int number = 11;

    public static void main(String[] args) {
        Main3 myObject = new Main3();
        //myObject.number = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObject.number);
    }
}
