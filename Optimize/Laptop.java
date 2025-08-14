package Optimize;

public class Laptop {
	private int id;
	private String brandName;
	private String ram;
	private float price;
	private String email;
	private String pass;
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
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brandName=" + brandName + ", ram=" + ram + ", price=" + price + ", email="
				+ email + ", pass=" + pass + "]";
	}
	
	
	
}
