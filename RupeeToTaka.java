package Project;

import java.util.Scanner;

public class RupeeToTaka extends CurrencyConverter {

		public RupeeToTaka(String country_name, String currency_name) {
			super(country_name, currency_name);
			
		}

		@Override
		void convertamt() {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Indian amount");
			double amt=s.nextDouble();
			System.out.println("1 Rupee = " + 1.32 + " Taka");
		    System.out.println();
		    
		    System.out.println("Converting Rupees to Taka");

		    System.out.println(amt+" Rupees = " + (amt*1.32) + " Taka");
		    System.out.println();
			
		}

	}


