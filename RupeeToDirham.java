package Project;

import java.util.Scanner;

public class RupeeToDirham extends CurrencyConverter{

		public RupeeToDirham(String country_name, String currency_name) {
			super(country_name, currency_name);
			
		}

		@Override
		void convertamt() {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Indian amount");
			double amt=s.nextDouble();
			System.out.println("1 Rupee = " + 0.044 + " Dirham");
		    System.out.println();
		    
		    System.out.println("Converting Rupees to Dirham");

		    System.out.println(amt+" Rupees = " + (amt*0.044) + " Dirham");
		    System.out.println();
		}


}
