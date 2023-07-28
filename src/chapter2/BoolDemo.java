package chapter2;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("Значение b: " + b);

        b = true;
        System.out.println("Значение b: " + b);

        // логическое значение можно использовать для управления условным оператором if
        if(b) System.out.println("Эта инструкция выполняется");

        b = false;
        if(b) System.out.println("Эта инструкция не выполняется");

        /*
        В результате выполнения сравнения получается логическое значение.
        Скобки в данном случае необходимы, потому что операция +
        имеет более высокий приоритет по сравнению с операцией >.
        */
        System.out.println("Результат сравнение 10 > 9: " + (10 > 9));
    }
}
