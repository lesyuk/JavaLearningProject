package chapter1;

import java.util.Scanner;

public class MoonWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш вес в кг: ");
        double weight = scanner.nextDouble();
        System.out.println(weight + " килограмм составили бы " +  weight * 0.17
                            + " на луне.");
    }
}
