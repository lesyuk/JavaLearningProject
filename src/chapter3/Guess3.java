package chapter3;
// Игра в угадывание букв, третья версия
public class Guess3 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'S';

        System.out.print("Задумана буква из диапазона A-Z.\nПопытайтесь ее угадать: ");

        ch = (char) System.in.read(); // получение символа с клавиатуры

        if(ch == answer) System.out.println("** Правильно! **");
        else {
            System.out.print("...Извините, нужная буква находится ");
            // вложенный оператор if
            if(ch < answer) System.out.print("ближе к концу алфавита");
            else System.out.println("ближе к началу алфавита");
        }
    }
}
