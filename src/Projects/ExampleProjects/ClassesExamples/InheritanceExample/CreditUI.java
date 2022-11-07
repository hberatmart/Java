package Projects.ExampleProjects.ClassesExamples.InheritanceExample;
//Burası sistami arayüze bağlayan kısımdır.
public class CreditUI {
    //Bunun sayesinde inherite olan class'ları çağırabilmenin nedenlerinden bir tanesi Referance type sayesindedir.
    public void calculateCredit(BaseCreditManager baseCreditManager) {
        baseCreditManager.calculate();
    }




    /*public void calculateCredit() {
        calculateCredit(new AgricultureCreditManager());
    }*/
    //Bunun yerine Base class'ı vermek daha iyidir.
    /*public void KrediHesapla(TeacherCreditManager teacherCreditManager){
        teacherCreditManager.Hesapla();
    }*/
}
