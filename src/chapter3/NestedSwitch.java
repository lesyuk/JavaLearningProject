package chapter3;
// Демонстрация использования вложенного оператора switch
public class NestedSwitch {
    public static void main(String[] args) {
        char ch1 = 'A', ch2 = 'B';

        switch (ch1) {
            case 'A':
                System.out.println("Это раздел A внешнего оператора switch");
                switch (ch2) {
                    case 'B':
                        System.out.println("Это раздел B внутреннего оператора switch");
                        break;
                }
                break;
        }
    }
}
