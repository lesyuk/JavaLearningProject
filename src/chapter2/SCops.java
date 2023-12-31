package chapter2;
// Демонстрация использования укороченных логических операций
public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;

        // Укороченная операция предотвращает деление на нуль
        if(d != 0 && (n % d) == 0) System.out.println(d + " является делителем " + n);

        d = 0;

        // Второй операнд не вычисляется поскольку значение переменной d равно нулю
        if(d != 0 && (n % d) == 0) System.out.println(d + " является делителем " + n);

        /*
        А теперь те же самые действия выполняются без использования укороченного логического оператора.
        В результате возникнет ошибка "деление на нуль".
         */
        if(d != 0 & (n % d) == 0) System.out.println(d + " является делителем " + n);
    }
}
