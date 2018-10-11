package CollectionsActivity;

public class SavingAccount implements Comparable<SavingAccount>{
	private int acc_ID;
	private String accountHoldername;
	private boolean isSalaryAccount;
	private double acc_balance;
	
	
	public SavingAccount(int acc_ID, String accountHoldername,boolean isSalaryAccount, double acc_balance) {
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
		this.acc_balance = acc_balance;
	}
	public void deposit(double amt){
		acc_balance+=amt;
	}
	public void withdraw(double amt){
		acc_balance-=amt;
	}
	public int getAcc_ID() {
		return acc_ID;
	}


	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}


	public String getAccountHoldername() {
		return accountHoldername;
	}


	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}


	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}


	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}


	public double getAcc_balance() {
		return acc_balance;
	}


	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}


	@Override
	public int compareTo(SavingAccount o) {
		if(this.acc_ID==o.acc_ID)return 0;
		else if(this.acc_ID<o.acc_ID)return -1;
		return 1;
	}
	
	public String toString(){
		return acc_ID+" "+accountHoldername+" "+isSalaryAccount+" "+acc_balance;
	}
}
