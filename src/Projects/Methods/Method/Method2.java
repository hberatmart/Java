package Projects.Methods.Method;
//Fonksiyonu ne kadar çağırısan o kadar yazdırma işlemi yapar.

public class Method2 {
    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }

    public static void myMethod(){
        System.out.println("Hello, I am Berat.");
    }
}
