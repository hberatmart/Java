package Projects.ExampleProjects.ClassesExamples.InheritanceExample;

public class AgricultureCreditManager extends BaseCreditManager{
    @Override
    void calculate() {
        super.calculate();
        System.out.println("kendim");
    }
}
