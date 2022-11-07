package Projects.Variables;

public class Variables1 {
    public static void main(String[] args) {
        String name = "Berat";
        System.out.println(name);

        String name2;
        name2 = "Halil";
        System.out.println(name2);


        final String fullName = "Halil Berat Mart";
        //fullName = "Berat" will generate an error: cannot assign a value to a final variable.
        System.out.println(fullName);

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);

        int myNum2 = 15;
        myNum2 = 20;  // myNum2 is now 20
        System.out.println(myNum2);

        }
}
