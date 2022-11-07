package Projects.ExampleProjects.ClassesExamples.staticDemo;
//Yapıcı blok sadece new yapılınca çalışmaktadır. Ama static kullanılırsa çalışmaktadır.
public class ProductValidator {
    static {
        System.out.println("Static Yapıcı blok çalıştı.");
    }

    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı.");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }

    }
}
