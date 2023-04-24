package fr.emile.ebusiness.model.dao;

import java.util.List;

import fr.emile.ebusiness.entity.Address;
import fr.emile.ebusiness.entity.User;

public interface IAddressDao   {
	
	int add(Address address) throws Exception; 
	List<Address> get(int userId) throws Exception;
	List<Address> get(User user) throws Exception;
	List<Address> get() throws Exception;
	Address getById(int Id) throws Exception ;
	
	int Update(Address address)throws Exception;
	int delete (int id)throws Exception;


}
