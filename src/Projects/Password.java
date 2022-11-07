package Projects;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        String correctPassword = "12345";

        Scanner scan = new Scanner(System.in);
        System.out.print("Password: ");
        String password = scan.nextLine();

        if(correctPassword.equals(password)) System.out.println("Giriş başarılı!");
        else System.out.println("Giriş başarısız!");
    }
}
