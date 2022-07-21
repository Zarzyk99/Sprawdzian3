package pl.kurs.homework;

public class Product implements Comparable<Product> {
    private String name;
    private double weightInKilograms;
    private String producer;
    private double price;
    private int expirationDateInMonths;
    private String countryOfOrigin;
    private double vatRate;

    public Product(String name, double grammar, String producer, double price, int expirationDateInMonths, String countryOfOrigin, double vatRate) {
        this.name = name;
        this.weightInKilograms = grammar;
        this.producer = producer;
        this.price = price;
        this.expirationDateInMonths = expirationDateInMonths;
        this.countryOfOrigin = countryOfOrigin;
        this.vatRate = vatRate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", grammar=" + weightInKilograms +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", expirationDateInMonths=" + expirationDateInMonths +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", vatRate=" + vatRate +
                '}';
    }

    @Override
    public int compareTo(Product p) {
        int result = name.compareTo(p.name);
        if (result == 0)
            result = producer.compareTo(p.producer);
        if (result == 0)
            result = Double.compare(weightInKilograms, p.weightInKilograms);
        if (result == 0)
            result = Integer.compare(expirationDateInMonths, p.expirationDateInMonths);
        if (result == 0)
            result = countryOfOrigin.compareTo(p.countryOfOrigin);
        if (result == 0)
            result = Double.compare(price, p.price);
        if (result == 0)
            result = Double.compare(vatRate, p.vatRate);
        return result;
    }
}
