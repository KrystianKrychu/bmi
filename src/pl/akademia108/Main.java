package pl.akademia108;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wprowadź swój wzrost: ");
        float wzrost = Float.valueOf(scan.next());

        System.out.println("Wprowadź swóją wagę: ");
        int waga = Integer.valueOf(scan.next());

        float bmi = waga/(wzrost * wzrost);

        System.out.println(bmi);

        if (bmi < 19) {
            System.out.println("Niedowaga");
        } else if (bmi <= 25) {
            System.out.println("Waga normalna");
        } else {
            System.out.println("Nadwaga");
        }

    }
}
