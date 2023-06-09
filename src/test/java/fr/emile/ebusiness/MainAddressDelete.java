package fr.emile.ebusiness;

import fr.emile.ebusiness.entity.Address;
import fr.emile.ebusiness.model.dao.AddressDao;
import fr.emile.ebusiness.model.dao.IAddressDao;

public class MainAddressDelete {
	public MainAddressDelete() {
	}

	public static void main(String[] args) {
		final IAddressDao myAddressDao = new AddressDao();
		final int idAddress = 1;
		try {
			Address myAddress= myAddressDao.getById(idAddress);
			System.out.printf("%s to delete \n",myAddress);
			
			int nbimpacted = myAddressDao.delete(idAddress);
			System.out.printf("Delete succed : %d\n",nbimpacted);
			myAddress= myAddressDao.getById(idAddress);
			System.out.printf("%s to delete \n",myAddress);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.printf("Error add %s", idAddress);
			
		}
	}
}
