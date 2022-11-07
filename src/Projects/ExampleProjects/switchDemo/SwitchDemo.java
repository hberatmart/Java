package Projects.ExampleProjects.switchDemo;

public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel, Geçtiniz");
                break;

            case 'B':
                System.out.println("Pekiyi, Geçtiniz");
                break;

            case 'C':
                System.out.println("iyi, Geçtiniz");
                break;

            case 'D':
                System.out.println("Orta, Geçtiniz");
                break;

            case 'F':
                System.out.println("Başarısız, Kaldınız");
                break;

            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
}
