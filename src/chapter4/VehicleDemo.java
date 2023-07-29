package chapter4;
/*
Программа,  в которой  используется класс  Vehicle
 */

// В этом классе объявляется объект типа Vehicle
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // Присваивание значений полям в объекте minivan
        minivan.passengers = 7; // точечная нотация для доступа к переменным экземпляра
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Рассчет дальности поездки при полном баке
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " +
                range + " миль");
    }
}
