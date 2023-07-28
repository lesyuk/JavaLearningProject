package chapter3;
/*
Упражнение 3.1

Простая справочная система
*/
public class Help {
    public static void main(String[] args) throws java.io.IOException {
        char input;

        System.out.print("Справка:\n1. if\n2. switch\nВыберите: ");

        input = (char) System.in.read();

        switch (input) {
            case '1':
                System.out.println("Оператор if:\n\nif(условие) оператор;\nelse оператор;");
                break;
            case '2':
                System.out.println("Оператор switch:\n\nswitch(выражение) {\ncase константа:\n" +
                        "последовательность операторов\nbreak;\n// ...\n}");
                break;
            default:
                System.out.println("Запрос не найден.");
        }
    }
}
