package CollectionsActivity;

public class Parked_CarOwner_Details {
	private String ownerName;
	private String carModel;
	private String carNo;
	private String ownerMobileNo;
	private String ownerAddres;
	
	
	public Parked_CarOwner_Details(String ownerName, String carModel,
			String carNo, String ownerMobileNo, String ownerAddres) {
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddres = ownerAddres;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getOwnerMobileNo() {
		return ownerMobileNo;
	}
	public void setOwnerMobileNo(String ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	public String getOwnerAddres() {
		return ownerAddres;
	}
	public void setOwnerAddres(String ownerAddres) {
		this.ownerAddres = ownerAddres;
	}
	public String toString()
    {
    	return "Owner Name:"+ownerName+" Car Model:"+carModel+" Car no:"+carNo+" Owner Address:"+ownerAddres+" Phone No: "+ownerMobileNo;
    }

	
}
