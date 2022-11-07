package Projects.ExampleProjects.arrays.arrayListDemo;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();

        //Ekleme
        numbers.add(1);
        numbers.add(18);
        numbers.add("Berat");

        //Eleman sayısını verir
        //System.out.println(numbers.size());

        //Eleman değiştirme
        //numbers.set(0,100);

        //Eleman çağırma
        //System.out.println(numbers.get(0));

        //Eleman silme
        //numbers.remove(0);
        //System.out.println(numbers.get(0));

        //Tamamen silme
        //numbers.clear();

        for(Object i:numbers){
            System.out.println(i);
        }

    }

}
