package fr.emile.ebusiness.model.dao;

import java.util.List;

import fr.emile.ebusiness.entity.User;

public interface IUserDao {
	int add(User user) throws Exception;
	User get(int id) throws Exception;
	List<User> get() throws Exception;
	int Update(User user)throws Exception;
	int delete (int id)throws Exception;
	int delete (User user)throws Exception;
}
