package chapter2;
/**
Усложним задачу. Рассчитать расстояние до крупного объекта, например скалы,
можно по времени прихода эхо. Так, если вы хлопнете в ладоши, время, через которое
вернется эхо, будет равно времени прохождения звука в прямом и обратном направлении.
Разделив этот промежуток времени на два, вы получите время прохождения звука от вас до объекта.
Полученное значение можно затем использовать для расчета расстояния до объекта.
Видоизмените рассмотренную выше программу, используя в расчетах промежуток времени до прихода эха.
 @see Sound
 */
public class Echo {
    public static void main(String[] args) {
        double dist;

        dist = 1100 * (12.3 / 2);

        System.out.println("Paccтoяниe до скалы составляет " + dist + " футов");
    }
}
