package bankFacade;

public class TransactionProcessor {
	private String idTrans;
	private Date date;
	private String content;
	private AccountManager manager;
	
	public TransactionProcessor() {
		super();
	}
	public TransactionProcessor(String idTrans, Date date, String content, AccountManager manager) {
		super();
		this.idTrans = idTrans;
		this.date = date;
		this.content = content;
		this.manager = manager;
	}
	public String getIdTrans() {
		return idTrans;
	}
	public void setIdTrans(String idTrans) {
		this.idTrans = idTrans;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public AccountManager getManager() {
		return manager;
	}
	public void setManager(AccountManager manager) {
		this.manager = manager;
	}
	public void withdraw(int id, int amount) {
		if (manager.checkLog(id) == true) {
			System.out.println("Tài khoản hợp lệ");
			System.out.println("Đăng nhập thành công");
			for (Account acc : manager.listAccount) {
				if (id == acc.getIdAccount()) {
					if (amount < acc.getBalance()) {
						acc.setBalance(acc.getBalance() - amount);
						System.out.println("Rút thành công số tiền: "+amount);
						System.out.println("Số tiền còn lại trong tài khoản: "+ acc.getBalance());
					}else {
						System.out.println("Số tiền trong tài khoản không đủ");
					}
				}
			}
		}else {
			System.out.println("Account không tồn tại");
		}
	}
	public void deposit(int id, int amount) {
		if (manager.checkLog(id) == true) {
			System.out.println("Tài khoản hợp lệ");
			System.out.println("Đăng nhập thành công");
			for (Account acc : manager.listAccount) {
				if (id == acc.getIdAccount()) {
						acc.setBalance(acc.getBalance() + amount);
						System.out.println("Nạp thành công số tiền: "+amount);
						System.out.println("Số tiền trong tài khoản: "+acc.getBalance());
				}
			}
		}else {
			System.out.println("Account không tồn tại");
		}
	}
	@Override
	public String toString() {
		return "TransactionProcessor [idTrans=" + idTrans + ", date=" + date + ", content=" + content + ", manager="
				+ manager + "]";
	}
	
	
	
}
