package chapter1;

public class Example3 {
    public static void main(String[] args) {
        int var; // объявление целочисленной переменной
        double x; // объявление переменнной с плавающей точкой

        var = 10; // присвоение переменной значения 10

        x = 10.0; // присвоение переменной значения 10.0

        System.out.println("Начальное значение переменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println();

        // Разделение значений обеих переменных на 4
        var = var / 4;
        x = x / 4;

        // Дробная часть числа теряется
        System.out.println("Значение переменной var после деления: " + var);
        // Дробная часть числа сохраняется
        System.out.println("Значение переменной x после деления: " + x);
    }
}
