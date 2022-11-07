package Projects.ExampleProjects.ClassesExamples.staticDemo;
//Kullan bırak araçlarda static yapılıyor. Her zaman kullanılmıyor.
//Bir method'u static yaptığınızda class adı ile çağıralirsin.
public class ProductManager {
    public void add(Product product){
        if(ProductValidator.isValid(product)){
            System.out.println("Added");
        }else {
            System.out.println("Not added");
        }

        /*
        Burası isValid fonksiyonunun static olmadığında yapılan kısım eğer static olursa üst kısımda var.
        ProductValidator validator = new ProductValidator();
        if(validator.isValid(product)){
            System.out.println("Added");
        }else {
            System.out.println("Not added");
        }*/

    }
}
