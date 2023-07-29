package chapter4;
/*
Добавление параметризованного метода, в котором производится расчет объема топлива, необходимого транспортному
средству для преодоления заданного расстояния.
 */
public class CompFuel {
    public static void main(String[] args) {
        // Переменные ссылаются на разные объекты
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        // Присваивание значений полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присваивание значений полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется "
                + gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется "
                + gallons + " галлонов топлива");
    }
}
