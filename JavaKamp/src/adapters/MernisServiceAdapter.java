package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
	if(customer.getNationalityId()=="12345"&&customer.getFirstName()=="Bulqeyis"&&customer.getLastName()=="Yunusova"&&customer.getDateOfBirth()=="2001") {
		return true;
	}
	else {
		return false;
	}

}}
