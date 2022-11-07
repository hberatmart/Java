package Projects.exceptionHandling.tryCatchFinally;

public class Main {

    public static void main(String[] args) {
        try {
            int[] numbers = new int[] {1,2,3};
            System.out.println(numbers[5]);
        } catch (Exception e){
            System.out.println("An error occurred!");
            System.out.println(e);
        } finally{
            System.out.println("This always works");
        }

    }
}
