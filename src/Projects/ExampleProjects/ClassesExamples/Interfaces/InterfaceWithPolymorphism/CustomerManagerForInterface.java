package Projects.ExampleProjects.ClassesExamples.Interfaces.InterfaceWithPolymorphism;

public class CustomerManagerForInterface {
    private ICustomerDal customerDal;

    public CustomerManagerForInterface(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        //Work kod
        customerDal.add();
    }
}
