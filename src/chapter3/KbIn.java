package chapter3;
// Чтение символа с клавиатуры
public class KbIn {
    public static void main(String[] args) throws java.io.IOException {
            char ch;

            System.out.println("Нажмите нужную клавишу, а затем клавишу ENTER: ");

            ch = (char) System.in.read(); // получение символа

            System.out.println("Вы нажали клавишу " + ch);
        }
}