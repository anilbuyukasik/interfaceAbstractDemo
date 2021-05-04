package interfaceAbstractDemo;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		Customer customer1 = new Customer(1,"Anýl","Büyükaþýk",LocalDate.of(1995,3, 10),"50000000000");
		Customer customer2 = new Customer(2,"Engin","Demiroð",LocalDate.of(1985,1, 6),"20000000000");
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		
		
		
		starbucksCustomerManager.save(customer1);
		neroCustomerManager.save(customer2);
		
	}

}
