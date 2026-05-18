package ProductInventorySystem;

public class ProductManager {

    Product[] products = new Product[100];
    int count = 0;

    // adding product
    void addProduct(Product p) {
        products[count] = p;
        count++;

    }

    // showing all product.
    void showAllProducts() {
        for (int i = 0; i < count; i++) {
            System.out.println("Produt Id : " + products[i].id +
                    ", Product Name : " + products[i].name +
                    ", Product price : " + products[i].price);

        }
    }

    // search by id

    void searchById(int id) {
        for (int i = 0; i < count; i++) {
            if (products[i].id == id) {
                System.out.println("Found ->");
                System.out.println("Produt Id : " + products[i].id +
                        ", Product Name : " + products[i].name +
                        ", Product price : " + products[i].price);
                return;
            }
        }
        System.out.println("Product not found");

    }

    // print the product which price is highest.

    void findMaxPriceProduct() {
        if (count == 0) {
            System.out.println("No product available");
            return;
        }

        Product maxProduct = products[0];
        for (int i = 1; i < count; i++) {
            if (maxProduct.price < products[i].price) {
                maxProduct = products[i];
            }
        }

        System.out.println("Max Price Product -> Id: " + maxProduct.id +
                ", Name: " + maxProduct.name +
                ", Price: " + maxProduct.price);
    }

}