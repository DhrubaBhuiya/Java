package CollectionsActivity;

public class Product implements Comparable<Product>{
	private String prodId;
	private String prodName;
	
	public Product(String prodId, String prodName) {
		this.prodId = prodId;
		this.prodName = prodName;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String toString(){
		return prodId+" "+prodName;
	}
	@Override
	public int compareTo(Product o) {
		return this.prodId.compareTo(o.prodId);
	}
	
}
