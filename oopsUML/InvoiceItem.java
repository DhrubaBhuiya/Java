package oopsUML;
public class InvoiceItem {
	private int id;
	private String desc;
	private int qty;
	private double unitPrice;
	public InvoiceItem(int id, String desc, int qty, double unitPrice){
		this.id=id;
		this.desc=desc;
		this.qty=qty;
		this.unitPrice=unitPrice;
	}
	public int getId() {
		return id;
	}
	public String getDesc() {
		return desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void settUnitPrice(double unitPrice) {
		this.unitPrice=unitPrice;
	}
	public double getTotal() {
		return qty*unitPrice;
	}
	public String toString(){
		return "InvoiceItem[id="+id+",desc="+desc+",qty="+qty+",unitPrice="+unitPrice+"]";
	}
}
