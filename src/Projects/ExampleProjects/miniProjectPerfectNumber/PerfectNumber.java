package Projects.ExampleProjects.miniProjectPerfectNumber;

//Perfect number: Sayıyı bölenlerin yoplamı kendine eşit ise mükemmel sayıdır. (Kendisi hariç.)

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 6;
        int total = 0;

        for (int i = 1; i < number; i++){
            if(number % i == 0){
                total = total + i;
            }
        }
        if(total == number){
            System.out.println("This is a perfect number.");
        }else {
            System.out.println("This is not a perfect number.");
        }
    }
}
