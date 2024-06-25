package Project;

import java.util.Scanner;

public class RupeeToPound extends CurrencyConverter {

		public RupeeToPound(String country_name, String currency_name) {
			super(country_name, currency_name);
			
		}

		@Override
		void convertamt() {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Indian amount");
			double amt=s.nextDouble();
			System.out.println("1 Rupee = " + 0.0095 + " Pound");
		    System.out.println();
		    
		    System.out.println("Converting Rupee to Pound");

		    System.out.println(amt+" Rupee = " + (amt*0.0095) + " Pound");
		    System.out.println();
			
		}

}
