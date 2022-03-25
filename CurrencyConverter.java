

import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

        public static void main(String[] args) {
		String first, second;
		first = args[0];
		second = args[1];
		handleConvertion(first, second);
        }

	public static String handleConvertion(String arg1, String arg2) {

                double amount, dollar, pound, code, euro;

                DecimalFormat f = new DecimalFormat("##.##");



                try 
                { 
                        Double.parseDouble(arg1); 
                }  
                catch (NumberFormatException e)  
                { 
                        System.out.println(arg1 + " is not a valid input, the system accepts only number or double."); 
                } 

                try 
                { 
                        Double.parseDouble(arg2); 
                }  
                catch (NumberFormatException e)  
                { 
                        System.out.println(arg2 + " is not a valid input, the system accepts only number or double."); 
                } 


                code = Double.parseDouble(arg1);
                amount = Double.parseDouble(arg2);

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
	return "test";
	}
}

