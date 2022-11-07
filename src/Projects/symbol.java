package Projects;

public class symbol {
    public static void main(String[] args) {
        int i,k;
        int symbol =0;

        for(k=0; k<=5; k++) {
            for (i=0; i < symbol || k == i; i++) {
                System.out.print("*");
            }
            System.out.println("");
            symbol = symbol + 2;
        }
    }
}
