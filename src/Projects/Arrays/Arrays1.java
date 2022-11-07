package Projects.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        //Length
        System.out.println(cars.length);
        // Change an Array Element
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars2[0] = "Opel";
        System.out.println(cars2[0]);
        // Now outputs Opel instead of Volvo
    }
}
