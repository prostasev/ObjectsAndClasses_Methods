// Arithmetic.java

public class Arithmetic {
    private int number1;
    private int number2;

    // Конструктор
    public Arithmetic(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    // Метод для вычисления суммы чисел
    public int calculateSum() {
        return number1 + number2;
    }

    // Метод для вычисления произведения чисел
    public int calculateProduct() {
        return number1 * number2;
    }

    // Метод для нахождения максимального из двух чисел
    public int findMaximum() {
        return Math.max(number1, number2);
    }

    // Метод для нахождения минимального из двух чисел
    public int findMinimum() {
        return Math.min(number1, number2);
    }

    public static void main(String[] args) {
        // Пример использования
        Arithmetic arithmetic = new Arithmetic(5, 8);
        System.out.println("Сумма: " + arithmetic.calculateSum());
        System.out.println("Произведение: " + arithmetic.calculateProduct());
        System.out.println("Максимум: " + arithmetic.findMaximum());
        System.out.println("Минимум: " + arithmetic.findMinimum());
    }
}
