package Projects.ExampleProjects.arrays.arraysListTypedDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cties = new ArrayList<>();

        cties.add("İstanbul");
        cties.add("Ankara");
        cties.add("İzmir");
        cties.add("Aydın");

        //obje ile de silinebiliyor.
        cties.remove("İstanbul");

        //sıralama yapar
        Collections.sort(cties);

        for (String city:cties){
            System.out.println(city);
        }
    }
}
