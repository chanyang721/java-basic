package Lecture.Basic.Class.Example;

public class Product {
    String name;
    int price;

    static Product getProduct (String name, int price) {
        Product product = new Product();
        product.name = name;
        product.price = price;

        return product;
    }
}
