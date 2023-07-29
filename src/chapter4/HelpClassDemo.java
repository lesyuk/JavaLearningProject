package chapter4;
/*
Упражнение 4.1

Преобразование в класс Help справочной системы из упражнения 3.3
 */
public class HelpClassDemo {
    public static void main(String[] args) throws java.io.IOException {
        char input, ignore;
        Help help = new Help();

        for (;;) {
            do {
                help.showMenu();

                input = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!help.isValid(input));

            if(input == 'q') break;

            System.out.println();

            help.helpOn(input);
        }
    }
}
