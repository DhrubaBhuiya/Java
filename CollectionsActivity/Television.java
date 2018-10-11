package CollectionsActivity;

import java.util.Objects;

public class Television {
	private String company;
	private String type;
	private boolean _3Denabled;
	private double price;
	public Television(String company, String type, boolean _3Denabled,
			double price) {
		this.company = company;
		this.type = type;
		this._3Denabled = _3Denabled;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean is_3Denabled() {
		return _3Denabled;
	}
	public void set_3Denabled(boolean _3Denabled) {
		this._3Denabled = _3Denabled;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object o){
		Television l = (Television)o;
		if(this.company.equals(l.company)&&this.type.equals(l.type)&&this.price==l.price)
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(company,type,price);
	}
	
}
