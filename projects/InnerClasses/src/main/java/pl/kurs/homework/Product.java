package pl.kurs.homework;

public class Product {
    private String producer;
    private String productName;
    private double weight;
    private double price;

    public Product(String producer, String productName, double weight, double price) {
        this.producer = producer;
        this.productName = productName;
        this.weight = weight;
        this.price = price;
    }


    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "producer='" + producer + '\'' +
                ", productName='" + productName + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
