package chapter4;

public class SomeTests {
    public static void main(String[] args) {
        char ch = '3';

        System.out.println((int) ch);

        System.out.println((int) '2');

        System.out.println(ch < '1' | ch > '7' & ch != 'q');
    }
}
