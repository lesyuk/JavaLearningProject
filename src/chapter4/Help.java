package chapter4;
/**
 В исходном файле НеlрЗ.java программы, реализующей справочную систему, имеется код, отвечающий за:
 - отображение меню,
 - получение информации от пользователя,
 - проверку достоверности ответа и
 - отображение данных, соответствующих выбранному пункту меню.

 В этой программе имеется также цикл, который завершается при вводе символа q

 При зрелом размышлении становится ясно, что отображение меню, проверки достоверности ответа и
 отображения данных являются составными частями справочной системы.

 В то же время порядок получения информации от пользователя и обработки многократных запросов (цикл) не имеет к
 системе непосредственного отношения.

 @see chapter3.Help3
*/
public class Help {
    void helpOn(int request) {
        switch (request) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Оператор switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("case константа:");
                System.out.println("последовательность операторов");
                System.out.println("break;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Оператор for:\n");
                System.out.println("for(инициализация; условие; итерация) оператор;");
                break;
            case '4':
                System.out.println("Оператор while:\n");
                System.out.println("while(условие) оператор;");
                break;
            case '5':
                System.out.println("Оператор do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие);");
                break;
            case '6':
                System.out.println("Оператор break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Оператор continue:\n");
                System.out.println("continue; или continue метка;");
                break;
        }
        System.out.println();
    }

    void showMenu() {
        System.out.println("Справка:");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("    3. for");
        System.out.println("    4. while");
        System.out.println("    5. do-while");
        System.out.println("    6. break");
        System.out.println("    7. continue");
        System.out.print("Введите соответствующую цифру или q для выхода: ");
    }

    boolean isValid(char ch) {
        return ch >= '1' & ch <= '7' | ch == 'q';
    }
}
