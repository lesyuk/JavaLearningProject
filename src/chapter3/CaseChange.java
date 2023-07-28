package chapter3;
/*
Код ASCII символов нижнего регистра отличается от кода соответствующих символов верхнего регистра на величину 32.
Следовательно, для преобразования строчной буквы в прописную нужно уменьшить ее код на 32.
Используйте это обстоятельство для написания программы, осуществляющей получение символов с клавиатуры.
При выводе результатов данная программа должна преобразовывать строчные буквы в прописные, а прописные - в строчные.
Остальные символы не должны изменяться. Работа программы должна завершаться после того, как пользователь
введет с клавиатуры точку.
И наконец, сделайте так, чтобы программа отображала число символов, для которых бьш изменен регистр.
 */
public class CaseChange {
    public static void main(String[] args) throws java.io.IOException {
        char input, ignore;
        int changeCounter = 0;

        System.out.print("Введите латинскую букву для конвертации или точку, чтобы выйти: ");

        do {
            input = (char) System.in.read();
            if (input >= 65 & input <= 90) {
                System.out.println((char) (input + 32));
                System.out.print("Повторите ввод или введите точку для выхода: ");
                changeCounter++;
            }
            else if (input >=97 & input <= 122) {
                System.out.println((char) (input - 32));
                System.out.print("Повторите ввод или введите точку для выхода: ");
                changeCounter++;
            }
            else if (input != '.') {
                System.out.print("Вы ввели не латинскую букву! Попробуйте еще раз: ");
            }
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (input != '.');
        System.out.println("Количество изменений регистра: " + changeCounter);
    }
}
