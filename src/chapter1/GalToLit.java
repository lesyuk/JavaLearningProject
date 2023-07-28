package chapter1;

/*
Упражнение 1.1
Программа  перевода галлонов  в литры.
*/
public class GalToLit {
    public static void main(String[] args) {
        // в этой переменной хранится значение, выражающее объем жидкости в галлонах
        double gallons;
        // в этой переменной хранится значение, выражающее объем жидкости в литрах
        double liters;

        gallons = 10; // начальное значение соответствует 10 галлонам

        liters = gallons * 3.7854; // перевод в литры

        System.out.println(gallons + " галлонам соответствует " + liters + " литров");
    }
}
