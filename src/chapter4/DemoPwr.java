package chapter4;

public class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 3);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " в степени " + x.e + " равно " + x.get_pwr());
        System.out.println(y.b + " в степени " + y.e + " равно " + y.get_pwr());
        System.out.println(z.b + " в степени " + z.e + " равно " + z.get_pwr());
    }
}
