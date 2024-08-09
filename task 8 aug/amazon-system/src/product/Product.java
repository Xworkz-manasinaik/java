package product;

public class Product {

    public String productCatagorey;
    public String productName;

    public String desp;
    public String colour;

    public int price;

    public void getDetails() {
        System.out.println("The Category of the product:" + this.productCatagorey);
        System.out.println("The Product Name is:" + this.productName);
        System.out.println("The Description of the product is:" + this.desp);
        System.out.println("The Colour of the product is:" + this.colour);
        System.out.println("The price is:" + this.price);
    }
}
