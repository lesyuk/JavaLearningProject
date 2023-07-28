package chapter3;
/*
 Упражнение 3.3

 Завершенная справочная система по управляющим операторам Java, обрабатывающая многократные запросы
 */
public class Help3 {
    public static void main(String[] args) throws java.io.IOException {
        char input, ignore;

        for (;;) {
            do {
                System.out.print("Справка:\n1. if\n2. switch\n3. for\n4. while\n5. do-while\n" +
                        "6. break\n7. continue\nВыберите (q - выход): ");

                input = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (input < '1' |  input > '7' & input != 'q');

            if(input == 'q') break;

            System.out.println();

            switch (input) {
                case '1':
                    System.out.println("Оператор if:\n\nif(условие) оператор;\nelse оператор;");
                    break;
                case '2':
                    System.out.println("Оператор switch:\n\nswitch(выражение) {\ncase константа:\n" +
                            "последовательность операторов\nbreak;\n// ...\n}");
                    break;
                case '3':
                    System.out.println("Оператор for:\n\nfor(инициализация; условие; итерация)\nоператор");
                    break;
                case '4':
                    System.out.println("Оператор while:\n\nwhile(условие) оператор");
                    break;
                case '5':
                    System.out.println("Оператор do-while:\n\ndo {\nоператор;\n} while (условие);");
                    break;
                case '6':
                    System.out.println("Оператор break:\n\nbreak; или break метка;");
                    break;
                case '7':
                    System.out.println("Оператор continue:\n\ncontinue; или continue метка;");
                    break;
            }
        }
    }
}
