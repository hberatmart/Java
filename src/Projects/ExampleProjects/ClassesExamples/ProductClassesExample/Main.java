package Projects.ExampleProjects.ClassesExamples.ProductClassesExample;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.id = 1;
        product.name = "Laptop";
        product.description = "Lenovo Laptop";
        product.price = 8500.35;
        product.stockAmount = 5;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);


    }

}
