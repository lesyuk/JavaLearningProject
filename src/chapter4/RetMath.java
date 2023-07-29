package chapter4;

public class RetMath {
    public static void main(String[] args) {
        // Переменные ссылаются на разные объекты
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // Присваивание значений полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присваивание значений полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " +
                minivan.range() + " миль");
        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers + " пассажиров на расстояние " +
                sportscar.range() + " миль");
    }
}
