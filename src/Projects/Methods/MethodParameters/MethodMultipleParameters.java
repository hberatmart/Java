package Projects.Methods.MethodParameters;

public class MethodMultipleParameters {
    public static void main(String[] args) {
        myMethod("Berat", 24);
        myMethod("Yalcin", 30);
        myMethod("Ferit", 25);
    }

    public static void myMethod(String fname, int age){
        System.out.println(fname + " " + "is" + " " + age);
    }
}
