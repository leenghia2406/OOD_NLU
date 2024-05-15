package bankFacade;

public class Account {
	private int idAccount;
	private String nameAccount;
	private double balance;
	
	public Account() {
		super();
	}
	public Account(int idAccount, String nameAccount, double balance) {
		super();
		this.idAccount = idAccount;
		this.nameAccount = nameAccount;
		this.balance = balance;
	}
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	public String getNameAccount() {
		return nameAccount;
	}
	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [idAccount=" + idAccount + ", nameAccount=" + nameAccount + ", balance=" + balance + "]";
	}
	
	
}
