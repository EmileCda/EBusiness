package fr.emile.ebusiness.model.dao;

import java.util.List;

import fr.emile.ebusiness.entity.Order;
import fr.emile.ebusiness.entity.User;

public interface IOrderDao {
	int add(Order order) throws Exception; 
	Order get(int id) throws Exception;
	List<Order> get(User user) throws Exception;
	List<Order> get() throws Exception;
	int Update(Order  order) throws Exception;

	int delete (Order order,boolean cancel)throws Exception;
	int delete(User user,boolean cancel) throws Exception ;

	int delete (Order order)throws Exception;
	int delete(User user) throws Exception ;

}
