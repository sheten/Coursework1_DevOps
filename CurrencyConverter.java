

import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

        public static void main(String[] args) {
                double amount, dollar, pound, code, euro;

                DecimalFormat f = new DecimalFormat("##.##");
		//Adding code to detect if both arguments was passed and none was missed
		if(args.length == 1) {
			System.out.println("You have missed to insert two arguments, system requires two arguments: 1st - choose currency 2nd - insert amount to convert. Please re-run the converter and insert both values");
		}

		//Adding code to check if numbers was passed, not strings or other elements 
                try 
                { 
                        Double.parseDouble(args[0]); 
                }  
                catch (NumberFormatException e)  
                { 
                        System.out.println(args[0] + " is not a valid input, the system accepts only number or double. Please re-run the converter and insert the number"); 
                } 

                try 
                { 
                        Double.parseDouble(args[1]); 
                }  
                catch (NumberFormatException e)  
                { 
                        System.out.println(args[1] + " is not a valid input, the system accepts only number or double. Pleae re-run the converter and insert the number"); 
                } 
		//If nothing breaks before, making passed arguments from string to double
                code = Double.parseDouble(args[0]);
                amount = Double.parseDouble(args[1]);

                // For amounts Conversion
                if (code == 1) {
                        // For Dollar Conversion
                        pound = amount * 0.74;
                        System.out.println(amount + " Dollars = " + f.format(pound) + " Pounds");

                        euro = amount * 0.88;
                        System.out.println(amount + " Dollars = " + f.format(euro) + " Euros");
                } else if (code == 2) {
                        // For Pound Conversion
                        dollar = amount + 0.36;
                        System.out.println(amount + " Pounds = " + f.format(dollar) + " Dollars");

                        euro = amount * 1.19;
                        System.out.println(amount + " Pound = " + f.format(euro) + " Euros");
                } else if (code == 3) {
                        // For Euro Conversion
                        dollar = amount * 1.13;
                        System.out.println(amount + " Euros = " + f.format(dollar) + " Dollars");

                        pound = amount * 0.84;
                        System.out.println(amount + " Euros = " + f.format(pound) + " Pounds");
               } else {
			// Adding code to check that selecting currency was inserted 1,2,3 and if some other value, warning the user
			System.out.println("Your input choosing currency was: "+code+"  However, the system accepts only numbers: 1,2,3. Please re-run the program and insert the right input");
		}
	}
}

