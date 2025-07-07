
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        double[] taxes = { 0.08, 0.18 };
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.print("| Price (Tl) : ");
            double price = sc.nextDouble();
            double tax = 0;

            while (price < 0) {
                System.out.print("Price cannot be less than 0.\n| Price (Tl) : ");
                price = sc.nextDouble();
            }
            if (price > 0 && price < 1000) {
                tax = calc_tax(price, taxes[1]);
            }
            else {
                tax = calc_tax(price, taxes[0]);
            }

            System.out.println("| Tax excluded price : " + price + "\n| Tax included price : " + (price + tax) + "\n| Tax : " + tax);
            System.out.print("| Exit (Yes : 0, No : 1) : ");
            exit = sc.nextInt() == 0;
        }
        sc.close();
    }

    private static double calc_tax(double price, double tax) {
        return price * tax;
    }
}
