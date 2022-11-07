package Projects.ExampleProjects.miniProjectFindingNumber;

public class FindingNumber {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 4, 5, 7,8};
        int numberToFind = 5;
        boolean isThere = false;

        for (int number : numbers){
            if(numberToFind == number){
                isThere = true;
                break;
            }
        }
        if (isThere) System.out.println("Number found");
        else System.out.println("Number did not find");

    }
}
