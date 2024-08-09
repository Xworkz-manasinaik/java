import amazon.Amazon;
import product.Product;

public class AmazonRunner {

    public  static void main(String args[]) {

        System.out.println("MAIN METHOD STARTED");

        Amazon amazon=new Amazon();
        amazon.id=1;

        Product product=new Product();

        product.productCatagorey= "Electronics";
        product.productName = "Laptop";
        product.desp = "8GB LPDDR4X RAM for full-power multitasking; 512GB SSD";
        product.colour = "Black";
        product.price = 45000;

        amazon.ordered(product);

        System.out.println("MAIN ENDED");
    }
}





