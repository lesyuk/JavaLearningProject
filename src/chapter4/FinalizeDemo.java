package chapter4;

public class FinalizeDemo {
    int x;

    FinalizeDemo(int i) {
        x = i;
    }

    // Вызывается при удалении объекта
    protected void finalize() {
        System.out.println("Финализация " + x);
    }

    // Генерируется объект, который тотчас уничтожается (переменная o начинается ссылаться на другой объект)
    void generator(int i) {
        FinalizeDemo o = new FinalizeDemo(i);
    }
}
