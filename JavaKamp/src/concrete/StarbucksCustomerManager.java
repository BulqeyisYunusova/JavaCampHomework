package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;

	}

	@Override
	public  void save(Customer customer) throws Exception {
		if (customerCheckService.checkIfRealPerson(customer)) {
		System.out.println("Save to DB: "+customer.getFirstName());
		} else {
			System.out.println("Not avalid person!");
		}
}
}
