package chapter3;
// Тело цикла for может быть пустым
public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for (i = 1; i <= 5; sum+= i++ ); // в цикле отсутствует тело

        System.out.println("Сумма: " + sum);
    }
}