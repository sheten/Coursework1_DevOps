import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

        public static void main(String[] args) {

                double amount, dollar, pound, code, euro;

                DecimalFormat f = new DecimalFormat("##.##");

                Scanner sc = new Scanner(System.in);

                System.out.println("Welcome Back to the Currency Converter!");

                System.out.println("Which currency do you want to convert? ");
                System.out.println("1:Dollars \t2:Pounds \t3:Euros");
                code = sc.nextInt();

                System.out.println("How much money do you want to convert?");
                amount = sc.nextFloat();

                // For amounts Conversion
                if (code == 1) {
                        // For Dollar Conversion
                        pound = amount * 0.74;
                        System.out.println(amount + " Dollars = " + f.format(pound) + " Pounds");

                        euro = amount * 0.88;
                        System.out.println(amount + " Dollars = " + f.format(euro) + " Euros");

                } else if (code == 2) {
                        // For Pound Conversion
                        dollar = amount + 1.36;
                        System.out.println(amount + " Pounds = " + f.format(dollar) + " Dollars");

                        euro = amount * 1.19;
                        System.out.println(amount + " Pound = " + f.format(euro) + " Euros");

                } else if (code == 3) {
                        // For Euro Conversion
                        dollar = amount * 1.31;
                        System.out.println(amount + " Euros = " + f.format(dollar) + " Dollars");

                        pound = amount * 0.84;
                        System.out.println(amount + " Euros = " + f.format(pound) + " Pounds");

                }

                System.out.println("Thank you for using the converter.");
        }

}

