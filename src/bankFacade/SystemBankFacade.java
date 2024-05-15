package bankFacade;

public class SystemBankFacade {
	AccountManager accManager;
	TransactionProcessor transProcessor;
	
	public SystemBankFacade() {
		super();
	}
	public SystemBankFacade(AccountManager accManager, TransactionProcessor transProcessor) {
		super();
		this.accManager = accManager;
		this.transProcessor = transProcessor;
	}
	public void withdraw(int id, int amount) {
		transProcessor.withdraw(id, amount);
	}
	public void deposit(int id, int amount) {
		transProcessor.deposit(id, amount);
	}
	public void checkLog(int id) {
		if (accManager.checkLog(id) == true) {
			System.out.println("Tài khoản hợp lệ");
			System.out.println("Đăng nhập thành công");
		}else {
			System.out.println("Tài khoản không tồn tại");
		}
	}
	@Override
	public String toString() {
		return "SystemBankFacade [accManager=" + accManager + ", transProcessor=" + transProcessor + "]";
	}
	
}
