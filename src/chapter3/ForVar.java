package chapter3;
// Объявление переменной цикла в самом цикле for
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // Вычисление факториала чисел от 1 до 5
        for (int i = 1; i <= 5; i++) { // Переменная i объявляется в самом операторе for
            sum += i; // переменная i доступна во всем цикле
            fact *= i;
        }

        // однако здесь переменная i недоступна

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
