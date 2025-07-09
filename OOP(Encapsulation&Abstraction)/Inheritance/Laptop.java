class Computer{

	String brand = "HP";
	String RAM = "128 RAM";

	public void lapDetails(){
		System.out.println("Brand Name : "+brand);
		System.out.println("RAM : "+RAM);
	}
}
class Laptop extends Computer{

	String batteryLife = "5 Years";

	public void lapDetails(){
		System.out.println("Brand Name : "+brand);
		System.out.println("RAM : "+RAM);
		System.out.println("Battery Life : "+batteryLife);
	}
	public static void main(String args[]){
		Laptop obj=new Laptop();
		obj.lapDetails();
	}
}