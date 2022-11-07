package Projects.ExampleProjects.multiDimensionalArrayDemo;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];
        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Ankara";
        cities[1][0] = "Osmaniye";
        cities[1][1] = "Muğla";
        cities[1][2] = "Hatay";
        cities[2][0] = "Elazığ";
        cities[2][1] = "İzmir";
        cities[2][2] = "Antalya";

        for (int i =0; i<=2; i++){
            System.out.println("-------------------------------");
            for (int j =0; j<=2; j++){
                System.out.println(cities[i][j]);
            }
        }

    }
}
