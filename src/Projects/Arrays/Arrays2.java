package Projects.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] students = new String[3];
        students[0] = "Berat";
        students[1] = "Ali";
        students[2] = "Ayşe";

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("-----------------OR--------------------");

        for (String student : students){
            System.out.println(student);
        }
    }
}
