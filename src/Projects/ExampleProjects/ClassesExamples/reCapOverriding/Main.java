package Projects.ExampleProjects.ClassesExamples.reCapOverriding;

import Projects.ExampleProjects.ClassesExamples.InheritanceExample.StudentCreditManager;

public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[] {new StudentCreditManager(), new TeacherCreditManager(), new AgricultureCreditManager()};

        for (BaseCreditManager creditManager: creditManagers){
            double creditAmount = creditManager.calculate(1000);
            System.out.println(creditAmount);
        }

    }
}
