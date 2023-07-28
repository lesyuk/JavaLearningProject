package chapter3;
// Применение оператора break для входа из цикла
public class BreakDemo {
    public static void main(String[] args) {
        int num;

        num = 100;

        // Выполнять цикл до тех пор, пока квадрат значения переменной i меньше значений переменной num
        for (int i=0; i < num; i++) {
            if(i * i >= num) break; // прекращение цикла, если i * i >= 100
            System.out.print(i + " ");
        }
        System.out.println("Цикл завершен.");
    }
}
