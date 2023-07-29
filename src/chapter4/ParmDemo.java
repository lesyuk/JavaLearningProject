package chapter4;
// Простой пример применения параметра в методе

class ChkNum {
    // вернуть логическое значение true, если x содержит четное число
    boolean isEven(int x) { // x - целочисленный параметр метода
        return x % 2 == 0;
    }
}
public class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if(e.isEven(10)) System.out.println("10 - четное число");
        if(e.isEven(9)) System.out.println("9 - четное число");
        if(e.isEven(8)) System.out.println("8 - четное число");
    }
}
