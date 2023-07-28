package chapter3;
// Применение запятых в операторе цикла for
public class Comma {
    public static void main(String[] args) {
        int i, j;

        // Для управления этим циклом используются две переменные
        for (i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i и j: " + i + " " + j);
        }
    }
}
