package CollectionsActivity;

public class MMASaving_Account {
	private String accountID;
	private String accountholder_name;
	private double account_balance;
	private boolean isSalaryAccount;
	
	public MMASaving_Account(String accountID, String accountholder_name,
	double account_balance, boolean isSalaryAccount) {
		this.accountID = accountID;
		this.accountholder_name = accountholder_name;
		this.account_balance = account_balance;
		this.isSalaryAccount = isSalaryAccount;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getAccountholder_name() {
		return accountholder_name;
	}
	public void setAccountholder_name(String accountholder_name) {
		this.accountholder_name = accountholder_name;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	public String toString(){
		return accountID+" "+accountholder_name+" "+account_balance+" "+isSalaryAccount;
	}
	
}
