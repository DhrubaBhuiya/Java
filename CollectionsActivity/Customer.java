package CollectionsActivity;

public class Customer {
	private int custNo;
	private String custName;
	public Customer(int custNo, String custName) {
		this.custNo = custNo;
		this.custName = custName;
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String toString()
	{
		return "Customer no: "+custNo+" Customer Name: "+custName;
	}
	
}
