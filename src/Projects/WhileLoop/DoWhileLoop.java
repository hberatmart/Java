package Projects.WhileLoop;
/*
do {
  // code block to be executed
}
while (condition);
*/

public class DoWhileLoop {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            ++i;
        }
        while (i < 5);
    }
}
