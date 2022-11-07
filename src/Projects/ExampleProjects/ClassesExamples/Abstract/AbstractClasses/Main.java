package Projects.ExampleProjects.ClassesExamples.Abstract.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();
        System.out.println("-----------------------------------------------");
        BaseGameCalculator baseGameCalculator = new KidsGameCalculator();
        baseGameCalculator.calculate();
        baseGameCalculator.gameOver();

    }
}
