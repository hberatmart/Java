package Projects.ExampleProjects.miniProjectFriendNumbers;

public class FriendNumbersAnotherProject {
    public static void main(String[] args) {
        int number = 786943237;
        int totalSecondNumberMaybe = 0;
        int totalFirstNumber = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                totalSecondNumberMaybe = totalSecondNumberMaybe + i;
            }
        }

        for(int j = 1; j < totalSecondNumberMaybe; j++) {
            if(totalSecondNumberMaybe % j == 0){
                totalFirstNumber = totalFirstNumber + j;
            }
        }

        if(number == totalFirstNumber) System.out.println("These are friend numbers: " + number + " " + totalSecondNumberMaybe);
        else System.out.println("These are not friend numbers: " + number + " " + totalSecondNumberMaybe);
    }
}
