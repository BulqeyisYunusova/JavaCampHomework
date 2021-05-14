package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;


public class NeroCustomerManager extends  BaseCustomerManager {

private CustomerCheckService customerCheckService;
	
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
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
