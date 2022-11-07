package Projects.ExampleProjects.ClassesExamples.staticDemo;
// Clean code yazılmaya çalışıldığı için pek önerilmeyen bir sistemdir.
public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.id = 1;
        product.name = "A";
        product.price = 7;
        manager.add(product);

        //inner class cagırma:
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
    }
}
