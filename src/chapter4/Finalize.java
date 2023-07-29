package chapter4;

public class Finalize {
    public static void main(String[] args) {
        int count;

        FinalizeDemo ob = new FinalizeDemo(0);

        /* Генерируется большое количество объектов.
        В какой-то момент времени должна начаться сборка мусора.
        Примечание: возможно, для того, чтобы активизировать систему сборки мусора,
        количество сгенерированных объектов придется увеличить. */
        for (count = 1; count < 2000000; count++) {
            ob.generator(count);
        }
    }
}
