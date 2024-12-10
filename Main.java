/**
 * Класс для представления товара с его количеством, ценой и скидкой.
 */
class Product {
    // Количество товаров
    private int quantity;
    // Цена товара
    private double price;
    // Скидка на товар в процентах
    private double discount;

    // Конструктор класса
    public Product(int quantity, double price, double discount) {
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    // Метод для подсчета и вывода сумм
    public void calculateTotal() {
        double totalWithoutDiscount = quantity * price; // Общая сумма без скидки
        double totalWithDiscount = totalWithoutDiscount * (1 - discount / 100); // Общая сумма со скидкой

        // Округление до 2 знаков после запятой
        totalWithoutDiscount = Math.round(totalWithoutDiscount * 100.0) / 100.0;
        totalWithDiscount = Math.round(totalWithDiscount * 100.0) / 100.0;

        System.out.println("Общая сумма без скидки: " + totalWithoutDiscount);
        System.out.println("Общая сумма со скидкой: " + totalWithDiscount);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объектов с различными параметрами
        Product product1 = new Product(10, 15.50, 0.75);
        Product product2 = new Product(5, 20.00, 42.575);
        Product product3 = new Product(3, 30.00, 59.1);

        // Вызов метода для подсчета сумм
        product1.calculateTotal();
        product2.calculateTotal();
        product3.calculateTotal();
    }
}
