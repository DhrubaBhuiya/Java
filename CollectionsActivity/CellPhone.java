package CollectionsActivity;

import java.util.Objects;

public class CellPhone {
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private double price;
	public CellPhone(String company, String model, String description,
			String operatingSystem, double price) {
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object o){
		CellPhone l = (CellPhone)o;
		if(this.company.equals(l.company)&&this.model.equals(l.model)&&this.operatingSystem.equals(l.operatingSystem))
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(company,model,operatingSystem);
	}
	
}
