package Projects.Methods.MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        int myNum1 = plusMethodInt(7, 53);
        double myNum2 = plusMethodDouble(8.78, 4.27);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }
}
