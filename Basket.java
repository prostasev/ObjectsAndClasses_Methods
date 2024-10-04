public class Basket {

    private static int count = 0; // Количество корзин
    private static int totalItemCount = 0; // Общее количество товаров во всех корзинах
    private static int totalCost = 0; // Общая стоимость всех товаров во всех корзинах

    private String items = "";
    private int totalPrice = 0;
    private double totalWeight = 0; // Обновлен тип переменной totalWeight
    private int limit;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count += count;
    }

    public static void increaseTotalItemCount(int count) {
        totalItemCount += count;
    }

    public static void increaseTotalCost(int cost) {
        totalCost += cost;
    }

    // Метод для расчета средней цены товара
    public static double calculateAveragePrice() {
        return totalItemCount == 0 ? 0 : (double) totalCost / totalItemCount;
    }

    // Метод для расчета средней стоимости корзины
    public static double calculateAverageBasketCost() {
        return count == 0 ? 0 : (double) totalCost / count;
    }

    // Обновленный метод add с параметром веса (weight)
    public void add(String name, int price, int count, double weight) {
        add(name, price, count);
        totalWeight += weight;
    }

    // Новый метод getTotalWeight
    public double getTotalWeight() {
        return totalWeight;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice += count * price;

        // Обновляем статические переменные
        increaseTotalItemCount(count);
        increaseTotalCost(totalPrice);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0; // Обнуление totalWeight при очистке корзины
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
