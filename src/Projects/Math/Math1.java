package Projects.Math;

public class Math1 {
    public static void main(String[] args) {
        
        // Math.max(x,y)
        System.out.println(Math.max(5,10));

        // Math.min(x,y)
        System.out.println(Math.min(5,10));

        // Math.sqrt(x)
        System.out.println(Math.sqrt(64));

        // Math.random() Random Numbers
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}
