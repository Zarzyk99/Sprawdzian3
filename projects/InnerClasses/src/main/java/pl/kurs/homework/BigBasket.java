package pl.kurs.homework;

public class BigBasket implements IBasket {
    private Product[] products;
    private int bigProductIndex;
    private SmallBasket smallBasket;

    public BigBasket(int capacityOfBigBasket, int capacityOfSmallBasket) {
        this.bigProductIndex = -1;
        products = new Product[capacityOfBigBasket];
        this.smallBasket = new SmallBasket(capacityOfSmallBasket);
    }

    private void addProductToBigBasket(Product product) {
        if (products.length == bigProductIndex + 1) {
            System.out.println("Duży koszyk jest już pełny");
        } else {
            products[++bigProductIndex] = product;
        }
    }

    @Override
    public void addProduct(Product product) {
        if (product == null) {
            System.out.println("Produkt nie może być nullem");
        } else if (product.getWeight() > 0.5) {
            addProductToBigBasket(product);
        } else {
            smallBasket.addProductToSmallBasket(product);
        }
    }

    public class SmallBasket {
        private Product[] products;
        private int smallProductIndex;

        public SmallBasket(int capacityOfSmallBasket) {
            this.smallProductIndex = -1;
            products = new Product[capacityOfSmallBasket];
        }

        private void addProductToSmallBasket(Product product) {
            if (products.length == smallProductIndex + 1) {
                System.out.println("Mały koszyk jest już pełny");
            } else {
                products[++smallProductIndex] = product;
            }
        }
    }

    public String getInfoOfSmallBasket() {
        System.out.println("Lista produktów w małym koszyku:");
        String info = "";
        for (int i = 0; i < smallBasket.products.length; i++) {
            if (smallBasket.products[i] != null)
                info = info + smallBasket.products[i] + ", \n";
        }
        return info;
    }

    public String getInfoOfBigBasket() {
        System.out.println("Lista produktów w dużym koszyku:");
        String info = "";
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null)
                info = info + products[i] + ", \n";
        }
        return info;
    }

    public double totalPrice() {
        double priceOfSmallBasketProducts = 0;
        double priceOfBigBasketProducts = 0;
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null)
                priceOfBigBasketProducts += products[i].getPrice();
        }
        for (int i = 0; i < smallBasket.products.length; i++) {
            if (smallBasket.products[i] != null)
                priceOfSmallBasketProducts += smallBasket.products[i].getPrice();
        }
        totalPrice = priceOfBigBasketProducts + priceOfSmallBasketProducts;
        return totalPrice;
    }

    public double totalWeight() {
        double weightOfSmallProducts = 0;
        double weightOfBigProducts = 0;
        double totalWeight = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null)
                weightOfBigProducts += products[i].getWeight();
        }
        for (int i = 0; i < smallBasket.products.length; i++) {
            if (smallBasket.products[i] != null)
                weightOfSmallProducts += smallBasket.products[i].getWeight();
        }
        totalWeight = weightOfSmallProducts + weightOfBigProducts;

        return totalWeight;
    }

}
