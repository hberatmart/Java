package Projects.Methods.MethodParameters;

public class MethodReturnValues {
    static int myMethod(int x) {
        return 5 + x;
    }
    // or
    static int myMethod2(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(5));

        System.out.println(myMethod2(3,5));

        //Or
        int z = myMethod2(5, 3);
        System.out.println(z);

    }
}
// Outputs 8 (5 + 3)
