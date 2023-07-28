package chapter2;
// Неожиданный результат повышения типов
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // Повышения типов не требуется, так как тип уже повышен до int

        b = 10;
        b = (byte) (b * b); // Здесь для присваивания значения int переменной типа byte требуется приведение типов!

        System.out.println("i and b: " + i + " " + b);
    }
}
