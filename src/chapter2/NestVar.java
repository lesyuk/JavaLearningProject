package chapter2;
/*
В этой программе предпринимается попытка объявить во внутренней области
действия переменную с таким же именем, как и у переменной,
объявленной во внешней области действия.
 */
public class NestVar {
    public static void main(String[] args) {
        int count;

        for(count = 0; count < 10; count++) {
            System.out.println("Значение count: " + count);

            // int count; // Недопустимо! Переменная count была объявление ранее

            for(count = 0; count < 2; count++) {
                System.out.println("В этой программе есть ошибка!");
            }
        }
    }
}
