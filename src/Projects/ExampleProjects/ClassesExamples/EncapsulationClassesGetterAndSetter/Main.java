package Projects.ExampleProjects.ClassesExamples.EncapsulationClassesGetterAndSetter;


public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Lenovo Laptop");
        product.setPrice(8500.35);
        product.setStockAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
