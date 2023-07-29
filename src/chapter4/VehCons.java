package chapter4;

class VehCons {
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галон

    // Конструктор класса VehCons
    VehCons(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Возврат дальности поездки для заданного транспортного средства
    int range() { // метод range() содержится в классе Vehicle
        // указание переменных без использование точечной нотации
        return mpg * fuelcap;     // использование возвращаемого значения
    }

    // Расчет объема топлива, необходимого транспортному средству для преодоления заданного расстояния
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}