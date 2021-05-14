import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager baseCustomerManager=new NeroCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1,"Bulqeyis","Yunusova","12345","2001"));

	}}
