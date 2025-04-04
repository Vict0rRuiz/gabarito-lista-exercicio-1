package Ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an hour: ");
        int hour = sc.nextInt();

        System.out.println("Enter an minute: ");
        int minute = sc.nextInt();

        System.out.println("Enter an second: ");
        int second = sc.nextInt();

        Hora hr = new Hora(hour, minute, second);

        System.out.println(hr.toString());
    }
}
