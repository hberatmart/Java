package Projects.ExampleProjects.workingWithFile;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    //getting started with files
    public static void createFile() {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\WorkSpace\\Programming\\Java\\src\\Projects\\ExampleProjects\\workingWithFile\\files\\students.txt");

        try {
            //Bu en path'e yazdığın en son txt dosyasını oluşturur.
            if (file.createNewFile()){
                System.out.println("File created.");
            }else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Read the information of the file
    public static void getFileInfo(){
        File file = new File("C:\\Users\\Lenovo\\Desktop\\WorkSpace\\Programming\\Java\\src\\Projects\\ExampleProjects\\workingWithFile\\files\\students.txt");

        if(file.exists()){
            System.out.println("Dosya adı : " + file.getName());
            System.out.println("Dosya yolu : " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi? : " + file.canWrite());
            System.out.println("Dosya okunabilir mi? : " + file.canRead());
            System.out.println("Dosya boyutu nedir (byte)? : " + file.length());

        }
    }
    //reading files
     public static void readFile(){
         File file = new File("C:\\Users\\Lenovo\\Desktop\\WorkSpace\\Programming\\Java\\src\\Projects\\ExampleProjects\\workingWithFile\\files\\students.txt");
         try {
             Scanner reader = new Scanner(file);
             while (reader.hasNextLine()){
                 String line = reader.nextLine();
                 System.out.println(line);
             }
             reader.close();
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
     }
     //wtiring files
     public static void writeFile(){
         try {                                                                                                                                                                                                     //önceki yazılan kısmı korur.
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\WorkSpace\\Programming\\Java\\src\\Projects\\ExampleProjects\\workingWithFile\\files\\students.txt", true));
             //Bir sonraki satıra geçirir.
             writer.newLine();
             writer.write("Ahmet");
             System.out.println("File printed");
             writer.newLine();
             writer.close();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

     }

}
