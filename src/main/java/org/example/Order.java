package org.example;

public class Order {
    public int numb;
    public int clientNumb;
    public String time;
    public double summa;
    public boolean isOut;
    private ProductInOrder[] products = new ProductInOrder[100];

    private int productCount = 0;

    public String status;

    void ChangeProduct(Product product, int count) {
        status = "Оформление заказа";
        for (int i = 0; i < productCount; ++i) {
            if (products[i].product.name.equals(product.name)) {
                if (count != 0) {
                    products[i].count = count;
                    return;
                } else {
                    if (i != productCount - 1) {
                        products[i] = products[productCount - 1];
                    }
                    products[productCount - 1] = null;
                    productCount--;
                    return;
                }
            }
        }
        products[productCount++] = new ProductInOrder(product, count);
    }

    void payment() {
        summa = 0;
        for (int i = 0; i < productCount; i++) {
            summa += products[i].count * products[i].product.price;
        }
        status = "Оплачен";
    }

    void getOrder() {
        status = "Получен";
    }

    public String toString() {
        String result = "" + clientNumb + ", " + summa + " rub, " + status + ": ";

        for (int i = 0; i < products.length; ++i) {
            result += products[i].product.name + " - " + products[i].count + ", ";
        }
        return result;
    }
}
