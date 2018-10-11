package CollectionsActivity;

import java.util.Objects;

public class Laptop {
	private String company;
	private String model;
	private String operationgSystem;
	private String processor;
	public Laptop(String company, String model, String operationgSystem,
			String processor) {
		this.company = company;
		this.model = model;
		this.operationgSystem = operationgSystem;
		this.processor = processor;
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
	public String getOperationgSystem() {
		return operationgSystem;
	}
	public void setOperationgSystem(String operationgSystem) {
		this.operationgSystem = operationgSystem;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	@Override
	public boolean equals(Object o){
		Laptop l = (Laptop)o;
		if(this.company.equals(l.company)&&this.model.equals(l.model))
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(company,model);
	}
}
