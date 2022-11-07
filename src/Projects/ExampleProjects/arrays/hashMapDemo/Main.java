package Projects.ExampleProjects.arrays.hashMapDemo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("book", "kitap");
        dictionary.put("table", "masa");
        dictionary.put("coputer", "bilgisayar");

        //boyutunu verir
        System.out.println(dictionary.size());

        //Süslü parantez içinde bütün değeri getirir
        System.out.println(dictionary);

        for (String item : dictionary.keySet()) {
            System.out.println("Key: " + item + " Value: " + dictionary.get(item));
        }

        //tableı siler
        dictionary.remove("table");
        System.out.println(dictionary.get("table"));

        dictionary.clear();
        System.out.println(dictionary.get("table"));

    }


}
