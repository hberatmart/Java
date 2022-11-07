package Projects.ExampleProjects.reCapDemo2;

public class RecapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.2, 6.3, 4.3, 5.6};

        double total = 0;

        double max = myList[0];

        double min = myList[0];

        for (Double number : myList){
            if(max<number){
                max = number;
            }

            if (min>number){
                min = number;
            }

            total = total + number;

            System.out.println(number);
        }
        System.out.println("Toplam " + total);

        System.out.println("En Büyük Sayı " + max);

        System.out.println("En küçük Sayı " + min);
    }
}
