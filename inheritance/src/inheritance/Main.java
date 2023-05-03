package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer Yusuf = new IndividualCustomer();
		Yusuf.customerNumber = "13445";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber ="7890";
	
		CustomerManager customerManager= new CustomerManager();
		customerManager.add(hepsiBurada);
		customerManager.add(Yusuf);
			
		CustomerManager customerManager1 = new CustomerManager();
		
		Customer[] customers= {Yusuf,hepsiBurada};
		
		customerManager1.addMultiple(customers);
	}

}
