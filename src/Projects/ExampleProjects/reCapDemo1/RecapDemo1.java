package Projects.ExampleProjects.reCapDemo1;

public class RecapDemo1 {
    public static void main(String[] args) {
        int number1 = 21;
        int number2 = 56;
        int number3 = 70;
        int bigNumber = number1;

        if (bigNumber<number2){
            bigNumber = number2;
        }

        if (bigNumber<number3){
            bigNumber = number3;
        }

        System.out.println("Big Number = " + bigNumber);

    }
}
