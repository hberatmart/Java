package Projects.exceptionHandling.readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) /*throws IOException bu kullanan kisi icindir.*/ {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\WorkSpace\\Programming\\Java\\src\\Projects\\exceptionHandling\\readingFileDemo\\numbers.txt"));
            String line = null;
            while ((line = reader.readLine()) != null){
                total += Integer.valueOf(line);
            }
            System.out.println("Total = " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) { //Exception kullanarak bu hatadan kurtulabilir.
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
