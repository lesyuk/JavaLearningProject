package chapter1;

/*
Демонстрация  использования  переменных.
*/
public class Example2 {
    public static void main(String[] args) {
        int var1; // объявляется переменнная
        int var2; // объявляется еще одна переменная

        var1 = 1024; // переменной var1 присваивается значение 1024

        System.out.println("Переменная var1 содержии значение: " + var1);

        var2 = var1 / 2;

        System.out.print("Переменная var2 содержии var1 / 2: ");
        System.out.println(var2);
    }
}
