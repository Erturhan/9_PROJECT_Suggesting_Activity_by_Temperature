import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please , enter the temperature value of the day :");
        double temperature = scan.nextDouble();

        if (temperature > 0 && temperature <= 5) {
            System.out.println("You can go skiing.");
        } else if (temperature > 5 && temperature < 15) {
            System.out.println("You can go to the theater.");
        } else if (temperature >= 15 && temperature <= 25) {
            System.out.println("You can have a barbecue.");
        } else if (temperature > 25 && temperature <= 35) {
            System.out.println("We recommend swimming.");
        } else {
            System.out.println("We do not recommend going outside.");
        }

    }
}