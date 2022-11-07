package Projects.ExampleProjects.ClassesExamples.InheritanceExample;

import Projects.ExampleProjects.ClassesExamples.reCapOverriding.BaseCreditManager;

public class StudentCreditManager extends BaseCreditManager {
    public double calculate(double amount){
        return amount * 1.10;
    }
}
