package chapter3;
// Этот фрагмент кода содержит ошибку
public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.println("Проход " + i + ": ");
        }

        for (int i = 0; i < 100; i++) {
//            if(i == 10) break one; // Неверно!
            System.out.println(i + " ");
        }
    }
}
