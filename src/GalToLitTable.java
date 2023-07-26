/*
Упражнение  1.2
Эта  программа  отображает таблицу  перевода  галлонов в литры.
*/
public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0; // счетчик инициализируется нулевым значением
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // преобразование в литры
            System.out.println(gallons + " галлонам соответствует " + liters + " литров");
            counter++; // увеличение значение счетчика на 1 на каждой итерации цикла

            if(counter == 10) { // если значение счетчика равно 10, выводится пустая строка
                System.out.println();
                counter = 0; // сброс счетчика строк
            }
        }
    }
}
