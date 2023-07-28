package chapter2;
/**
 Попытайтесь видоизменить программу так, чтобы вместо логических значений true и false отображались значения 1 и 0.
 Это потребует больших усилий, чем кажется на первый взгляд!
 @see LogicalOpTable
 */
public class LogicalOpTableToInt {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("p\tq\tand\tor\txor\tnot p");

        p = true; q = true;

        printIntRow(p, q);

        p = true; q= false;

        printIntRow(p, q);

        p = false; q= true;

        printIntRow(p, q);

        p = false; q= false;

        printIntRow(p, q);
    }

    public static void printIntRow(boolean p, boolean q) {
        int pToInt = p ? 1 : 0;
        int qToInt = q ? 1 : 0;
        System.out.print(pToInt + "\t" + qToInt + "\t");
        System.out.print((pToInt & qToInt) + "\t" + (pToInt | qToInt) + "\t");
        System.out.println((pToInt ^ qToInt) + "\t" + (p ? 0 : 1));
    }
}
