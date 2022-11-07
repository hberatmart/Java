package Projects.ExampleProjects.ClassesExamples.Abstract.AbstractClasses;

public abstract class BaseGameCalculator {
    public abstract void calculate();

    public final void gameOver(){
        System.out.println("Game Over!");
    }
}
