public class Main {

    public static void main(String[] args) {
        // Создаем объект корзины
        Basket basket = new Basket();

        // Добавляем товар с указанием имени, цены, количества и веса
        basket.add("Milk", 40, 4, 1.5);

        // Выводим общую массу товаров в корзине
        System.out.println("Total Weight: " + basket.getTotalWeight());

        // Выводим содержимое корзины
        basket.print("Basket Contents");
    }
}
