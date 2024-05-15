package bankFacade;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	List<Account> listAccount = new ArrayList<>();

	public AccountManager() {
		super();
	}

	public AccountManager(List<Account> listAccount) {
		super();
		this.listAccount = listAccount;
	}

	public List<Account> getListAccount() {
		return listAccount;
	}

	public void setListAccount(List<Account> listAccount) {
		this.listAccount = listAccount;
	}
	public boolean checkLog(int id) {
		for (Account account : listAccount) {
			if (id == account.getIdAccount()) {
				return true;
			}
		}
		return false;
	}
	public void addAccount(Account acc) {
		listAccount.add(acc);
	}
	public void removeAccount(Account acc) {
		listAccount.remove(acc);
	}
	@Override
	public String toString() {
		return "AccountManager [listAccount=" + listAccount + "]";
	}
	
}
