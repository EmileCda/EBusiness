package fr.emile.ebusiness;

import fr.emile.ebusiness.entity.BankCard;
import fr.emile.ebusiness.model.dao.BankCardDao;
import fr.emile.ebusiness.model.dao.IBankCardDao;
import fr.emile.ebusiness.utils.Utils;

public class MainBankCardUpdate {
	public static void main(String[] args) {
		final IBankCardDao myBankCardDao = new BankCardDao();
		final int bankCardId = 2;
		BankCard myBankCard = new BankCard();

		try {

			myBankCard = new BankCard();
			myBankCard = myBankCardDao.get(bankCardId);
			Utils.trace(myBankCard.toString());

			myBankCardDao.Invalidate(myBankCard, false);
			myBankCard = myBankCardDao.get(bankCardId);
			Utils.trace(myBankCard.toString());

			myBankCardDao.Invalidate(myBankCard, true);
			myBankCard = myBankCardDao.get(bankCardId);
			Utils.trace(myBankCard.toString());


			myBankCardDao.Invalidate(myBankCard);
			myBankCard = myBankCardDao.get(bankCardId);
			Utils.trace(myBankCard.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.printf("Error add %s", myBankCard);

		}
	}
}
