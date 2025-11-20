package org.example;

public class ViT {
    public static Product[] products;

    public static void main(String[] args) {
        createMenu();
        Order order1 = new Order();
        order1.ChangeProduct(products[1], 2);
        order1.ChangeProduct(products[2], 1);
        System.out.print(order1);
        order1.ChangeProduct(products[2], 4);
        System.out.print(order1);
        order1.payment();
        System.out.print(order1);
        order1.getOrder();
        System.out.print(order1);
    }

    public static void createMenu() {
        products = new Product[3];
        Category desert = new Category("десерт");
        Product cheesecake = new Product("чизкейк", desert, 120);
        Product pirozhok = new Product("пирожок", desert, 50);
        Category drinks = new Category("Напитки");
        Product tea = new Product("Чай", drinks, 25);
        products[0] = cheesecake;
        products[1] = pirozhok;
        products[2] = tea;
    }
}