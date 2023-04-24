package fr.emile.ebusiness;

import fr.emile.ebusiness.entity.User;
import fr.emile.ebusiness.model.dao.IUserDao;
import fr.emile.ebusiness.model.dao.UserDao;

public class MainUserDelete {
	public static void main(String[] args) {
		final IUserDao myUserDao = new UserDao();
		User myUser = new User();
		int idUser = 3;
		myUser.setId(idUser);
		try {
			// delete by id 
			myUser = myUserDao.get(idUser);
			int nbImpacted = myUserDao.delete(idUser);
			System.out.printf("user %s Deleted  nb impacted : %d\n",myUser, nbImpacted);

			// delete by user  
			idUser = 4;
			myUser.setId(idUser);
			myUser = myUserDao.get(idUser);
			nbImpacted = myUserDao.delete(myUser);
			System.out.printf("user %s Deleted  nb impacted : %d\n",myUser, nbImpacted);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.printf("Error add %s", myUser);
			
		}
	}
}
