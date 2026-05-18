package ProductInventorySystem;

public class Main {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        pm.addProduct(new Product(1, "Mouse", 500));
        pm.addProduct(new Product(2, "Keyboard", 800));
        pm.addProduct(new Product(3, "Monitor", 7000));

        System.out.println("==show all products==");
        pm.showAllProducts();

        System.out.println("==Search by id==");
        pm.searchById(2);

        System.out.println("==Higest price product");
        pm.findMaxPriceProduct();

    }
}
