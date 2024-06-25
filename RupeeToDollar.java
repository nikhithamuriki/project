package Project;

import java.util.Scanner;

public class RupeeToDollar extends CurrencyConverter {

		public RupeeToDollar(String country_name, String currency_name) {
			super(country_name, currency_name);
			
		}

		@Override
		void convertamt() {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Indian amount");
			double amt=s.nextDouble();
			System.out.println("1 Ruppe = " + 0.012 + " Dollar");
		    System.out.println();
		    
		    System.out.println("Converting Rupees to Dollars");

		    System.out.println(amt+" Rupees = " + (amt*0.013) + " Dollar");
		    System.out.println();
		}
		

	}


