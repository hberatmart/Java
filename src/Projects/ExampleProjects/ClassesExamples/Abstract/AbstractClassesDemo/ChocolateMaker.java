package Projects.ExampleProjects.ClassesExamples.Abstract.AbstractClassesDemo;

public abstract class ChocolateMaker {
    abstract int cacaoRatio();

    Cohocolate make() {
        int cacaoRatio = cacaoRatio();
        int sugar = cacaoRatio / 2;
        int milk = sugar / 2;

        return new Cohocolate(cacaoRatio, sugar, milk);
    }
}
