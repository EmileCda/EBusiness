package fr.emile.ebusiness;

import fr.emile.ebusiness.entity.User;
import fr.emile.ebusiness.model.dao.IUserDao;
import fr.emile.ebusiness.model.dao.UserDao;
import fr.emile.ebusiness.utils.Utils;

public class MainUserUpdate {
	public static void main(String[] args) {
		try {
			IUserDao userDao = new UserDao();
			User user = userDao.get(1);
			user.setFirstname("John");
			user.setLastname("Doe");
			user.setDateOfBirth(Utils.string2Date("25/12/0001","dd/MM/yyyy"));
			Utils.trace(user.toString()	);
			int nbImpacted = userDao.Update(user);
			System.out.printf("USER %s updated  nb impacted : %d\n",user, nbImpacted);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
