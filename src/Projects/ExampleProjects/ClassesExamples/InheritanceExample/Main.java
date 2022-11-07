package Projects.ExampleProjects.ClassesExamples.InheritanceExample;

public class Main {
    public static void main(String[] args) {
        //TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        //teacherCreditManager.Hesapla();
        CreditUI creditUI = new CreditUI();
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        creditUI.calculateCredit(teacherCreditManager);
        creditUI.calculateCredit(new AgricultureCreditManager());
        teacherCreditManager.add();
    }
}
