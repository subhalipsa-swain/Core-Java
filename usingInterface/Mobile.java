package usingInterface;

public class Mobile {
	private int id;
	private String brandName;
	private double price;
	private String modelNo;
	private String ram;
	private String storage;
	private String createdDate;
	private String UpdatedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return UpdatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		UpdatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brandName=" + brandName + ", price=" + price + ", modelNo=" + modelNo + ", ram="
				+ ram + ", storage=" + storage + ", createdDate=" + createdDate + ", UpdatedDate=" + UpdatedDate + "]";
	}
	
	
}
