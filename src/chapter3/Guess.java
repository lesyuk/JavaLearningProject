package chapter3;
// Игра в угадывание букв.
public class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'S';

        System.out.print("Задумана буква из диапазона A-Z.\nПопытайтесь ее угадать: ");

        ch = (char) System.in.read(); // получение символа с клавиатуры

        if(ch == answer) System.out.println("** Правильно! **");
    }
}
