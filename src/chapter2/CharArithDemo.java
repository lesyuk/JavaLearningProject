package chapter2;

// с символьными переменными можно обращаться как с целочисленными
public class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++; // переменную типа char можно инкрементировать
        System.out.println("теперь ch содержит " + ch);

        ch = 90; // переменной типа char можно присвоить целочисленное значение
        System.out.println("теперь ch содержит " + ch);
    }
}
