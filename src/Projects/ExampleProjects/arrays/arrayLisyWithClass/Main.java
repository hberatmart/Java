package Projects.ExampleProjects.arrays.arrayLisyWithClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer berat = new Customer(1,"Berat", "Mart");
        customers.add(berat);
        customers.add(new Customer(2,"Fatma", "Mart"));
        customers.add(new Customer(3,"Mehmet", "Mart"));
        //Bu böyle kaldırılır.
        customers.remove(berat);
        //fakat böyle kaldırılmaz.
        customers.remove(new Customer(2,"Fatma", "Mart"));

        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }

    }
}
