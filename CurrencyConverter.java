package Project;


	public abstract class CurrencyConverter {

		String country_name;
		String currency_name;
		public CurrencyConverter(String country_name,String currency_name)
		{
			this.country_name=country_name;
			this.currency_name=currency_name;
			System.out.println("Country_Name: "+country_name+"\n"+"Currency_Name: "+currency_name);
		}
		abstract void convertamt();
		
	}


