import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.SturbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
		baseCustomerManager.save(new Customer(1, "Kerem", "Karataþ", "11111111111", LocalDate.of(2000, 6, 12)));
		
		BaseCustomerManager baseCustomerManager2=new SturbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager2.save(new Customer(1, "Kerem", "Karataþ", "12345678999", LocalDate.of(2000, 6, 12)));

	}

}
