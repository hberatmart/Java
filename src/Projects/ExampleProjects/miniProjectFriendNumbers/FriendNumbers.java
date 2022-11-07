package Projects.ExampleProjects.miniProjectFriendNumbers;

/*
Friend numbers ilk sayının kendisi hariç diğer bölenlerinin toplamı ikinci sayıya eşitse ve ikinci sayanında
kendisi hariç bölenlerinin toplamı ilk sayıya eşit ise bunlar arkadaş sayılardır.
 */


public class FriendNumbers {
    public static void main(String[] args) {
        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for(int i = 1; i < number1; i++){
            if(number1 % i == 0){
                total1 = total1 + i;
            }
        }

        for(int i = 1; i < number2; i++){
            if(number2 % i == 0){
                total2 = total2 + i;
            }
        }

        if(number1 == total2 && number2 == total1){
            System.out.println("These is friend numbers.");
        }else {
            System.out.println("These is not friend numbers");
        }

    }
}
