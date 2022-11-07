package Projects.Methods.MethodParameters;

public class MethodWithIfElse {
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        checkAge(13); // Call the checkAge method and pass along an age of 20
    }
}

// Outputs "Access granted - You are old enough!"
