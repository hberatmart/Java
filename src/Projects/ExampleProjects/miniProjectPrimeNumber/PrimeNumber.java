package Projects.ExampleProjects.miniProjectPrimeNumber;

public class PrimeNumber {
    public static void main(String[] args) {
        long number = 786943237L;
        boolean isPrime = true;


        if(number == 1){
            System.out.println("Number isn't prime");
            return;
        }

        if(number<1){
            System.out.println("Number is invalid.");
            return;
        }
            // 30  60 90
        for (long i = 2; i < number/2; i++) {

            if (number % i == 0 ) {
                isPrime = false;
                break;
            }

        }
        if(isPrime) System.out.println("Number is prime.");
        else System.out.println("Number isn't prime.");
    }
}
