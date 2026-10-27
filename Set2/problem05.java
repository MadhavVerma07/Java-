import java.util.HashMap;
import java.util.Map;

public class problem05 {
    static class Product {
        private final int id;
        private final String name;
        private int price;

        public Product(int id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    static class ProductCatalogue {
        private  Map<Integer, Product> catalogue = new HashMap<>();

        public void addProduct(Product product) {
            if (catalogue.containsKey(product.getId())) {
                System.out.println("Product already exists");
            } else {
                catalogue.put(product.getId(), product);
                System.out.println("Succeeded");
            }
        }

        public Product searchProduct(int id) {
            return catalogue.get(id);
        }
    }

     void main() {
        Product p = new Product(1,"phone",20000) ;
        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.addProduct(p);

        Product p1 = catalogue.searchProduct(2);
        if (p1 != null) {
            IO.println(p1.getName());
        }
        else{
            IO.println("Product not found ");
        }
    }
}