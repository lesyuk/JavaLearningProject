package chapter3;
// Демонстрация использовния цикла while
public class WhileDemo {
    public static void main(String[] args) {
        char ch;

        // Вывести буквы английского алфавита, используя цикл while
        ch = 'a';
        while(ch <= 'z') {
            System.out.println(ch);
            ch++;
        }
    }
}
