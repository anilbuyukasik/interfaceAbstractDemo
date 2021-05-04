package Adapters;

import tr.gov.nvi.tckimlik.WS.*;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer){
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		return result;
		
	}

}
