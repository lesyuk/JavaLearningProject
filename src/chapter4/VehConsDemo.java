package chapter4;

public class VehConsDemo {
    public static void main(String[] args) {
        // Переменные ссылаются на разные объекты
        VehCons minivan = new VehCons(7, 16, 21);
        VehCons sportscar = new VehCons(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется "
                + gallons + " галлонов топлива");

        gallons = sportscar.fuelNeeded(dist);

        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется "
                + gallons + " галлонов топлива");
    }
}
