package Projects.exceptionHandling.tryCatchFinally;

public class Main2 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[] {1,2,3};
            System.out.println(numbers[5]);
        } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException){
            System.out.println("An error occurred!");
            System.out.println(stringIndexOutOfBoundsException);
        } //catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            //System.out.println(arrayIndexOutOfBoundsException);
        //}
        catch (Exception e){
            System.out.println("Loglandı : " + e);
        }
        finally {
            System.out.println("This always works");
        }
    }
}
