package bankFacade;

import java.util.ArrayList;

public class Demo {
	SystemBankFacade bankFacade;
	
	public Demo() {
		super();
	}

	public Demo(SystemBankFacade bankFacade) {
		super();
		this.bankFacade = bankFacade;
	}

	public static void main(String[] args) {
		new Demo();
		Account acc1 = new Account(1111, "Bayern Munchen", 100000.0);
		Account acc2 = new Account(2222, "Real Madrid", 800000.0);
		Account acc3 = new Account(3333, "Liverpool", 550000.0);
		AccountManager manager = new AccountManager();
		manager.addAccount(acc1);
		manager.addAccount(acc2);
		manager.addAccount(acc3);
		TransactionProcessor trans1 = new TransactionProcessor("1001", new Date(24, 6, 2004), "", manager);
		TransactionProcessor trans2 = new TransactionProcessor("1002", new Date(24, 7, 2004), "", manager);
		TransactionProcessor trans3 = new TransactionProcessor("1003", new Date(24, 8, 2004), "", manager);
		SystemBankFacade bankFacade = new SystemBankFacade(manager, trans1);
//		bankFacade.checkLog(1111);
		bankFacade.deposit(2222, 200000);
		bankFacade.withdraw(2222, 200000);
		SystemBankFacade bankFacade1 = new SystemBankFacade(manager, trans2);
		bankFacade1.deposit(4444, 100000); // tai khoan khong hop le
		SystemBankFacade bankFacade2 = new SystemBankFacade(manager, trans3);
		bankFacade2.withdraw(3333, 250000);
//		bankFacade2.deposit(3333, 100000);
	}
}
