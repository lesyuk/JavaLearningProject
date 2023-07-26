public class InchesToMeters {
    public static void main(String[] args) {
        double inches, meters;
        int counter = 0;

        for(inches = 1; inches <= 120; inches++) {
            meters = inches / 39.37;
            System.out.println(inches + " дюймов соответствует " + meters + " метрам");
            counter++;

            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
