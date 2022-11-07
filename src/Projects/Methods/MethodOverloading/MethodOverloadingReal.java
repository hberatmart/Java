package Projects.Methods.MethodOverloading;

public class MethodOverloadingReal {
    static int plusMethod(int x, int y) {

        return x + y;
    }

    static double plusMethod(double x, double y) {

        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(3, 45);
        double myNum2 = plusMethod(7.98, 2.65);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

}



