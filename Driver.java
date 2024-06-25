package Project;


	public class Driver {

		public static void main(String[] args) {
			RupeeToDollar rd=new RupeeToDollar("America","Dollars");
			rd.convertamt();
			
			RupeeToEuro re=new RupeeToEuro("France","Euro");
			re.convertamt();
			
			RupeeToDirham rtd=new RupeeToDirham("United Arab","Dirham");
			rtd.convertamt();
			
			RupeeToPound rp=new RupeeToPound("England","Pound");
			rp.convertamt();
			
			RupeeToTaka rk=new RupeeToTaka("Bangladesh","Taka");
			rk.convertamt();
		}

	}


