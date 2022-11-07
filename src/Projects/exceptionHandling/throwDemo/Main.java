package Projects.exceptionHandling.throwDemo;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();

        System.out.println("Hesap: " + accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Hesap: " + accountManager.getBalance());
        try {
            accountManager.withdraw(90);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap: " + accountManager.getBalance());
        try {
            accountManager.withdraw(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap: " + accountManager.getBalance());

    }
}
