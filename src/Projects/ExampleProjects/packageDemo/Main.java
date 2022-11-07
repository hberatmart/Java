package Projects.ExampleProjects.packageDemo;

//mport Projects.ExampleProjects.packageDemo.math.Calculator;
//import Projects.ExampleProjects.packageDemo.math.Log;
//or -> ikiside aynı işlemdir alt kısımda bulunanda yaygın kullanımdır.
import Projects.ExampleProjects.packageDemo.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        Calculator calculator = new Calculator();
        int result = calculator.add(2,3);
        System.out.println(result);

        Log log = new Log();
        System.out.println(log.logCalculator());
    }
}
