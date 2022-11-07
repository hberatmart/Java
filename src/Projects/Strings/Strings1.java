package Projects.Strings;

import java.util.Locale;

public class Strings1 {
    public static void main(String[] args) {
        //String
        String name = "Berat";
        System.out.println(name);

        //Lenght
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //chatAt
        System.out.println("5. eleman= " + txt.charAt(4));

        //startsWith = Eğer A ile başlıyorsa true, başlamıyorsa folse döner. (büyük küçük harf duyarlılığı vardır.)
        System.out.println(txt.startsWith("A"));

        //endsWith = Eğer Z ile bitiyorsa true, bitmıyorsa folse döner. (büyük küçük harf duyarlılığı vardır.)
        System.out.println(txt.endsWith("Z"));

        //getChars = Karakteri arrays'e almamızda yardımcı olur. srcEnd son elemanı almaz ona göre +1 değer fazla girilir.
        char[] characters = new char[4];
        txt.getChars(0,4,characters,0);
        System.out.println(characters);

        //toUpperCase() and toLowerCase()
        System.out.println(name.toUpperCase()); //Output: BERAT
        System.out.println(name.toLowerCase()); //Output: berat

        //Finding a Character in a String (indexOf())
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));

        //Finding a Character in a String (lastIndexOf())
        System.out.println(txt2.lastIndexOf("u"));

        //Replace
        String iamberat = "I am berat";
        System.out.println(iamberat.replace(" ", "-"));

        //substring
        System.out.println(iamberat.substring(2));
        System.out.println(iamberat.substring(5, 10)); //ikinci girilen değerde duracaktır. Fakat 5 ise 4 e kadar alacaktır.

        //split
        for(String word : iamberat.split(" ")){
            System.out.println(word);

        }

        //trim : string başında ve sonundaki boşlukları kaldırır.
        String txt3 = "          Hello Guys          ";
        System.out.println(txt3.trim());

        //String Concatenation
        String firstName = "Ali";
        String firstName2 = "Ali ";
        String lastName = "Can";
        System.out.println(firstName + " " + lastName);
        System.out.println("Or " + firstName2.concat(lastName));


    }
}
