package chapter4;

public class MyMeth {
    public static void main(String[] args) {
        MyMeth.myMeth();
    }

    static void myMeth() {
        int i;
        for (i = 0; i < 10; i++) {
            if(i == 5) return; // Завершить цикл на значении 5
            System.out.println();
        }
    }
}
