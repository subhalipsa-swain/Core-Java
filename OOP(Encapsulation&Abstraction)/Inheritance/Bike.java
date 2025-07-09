class Vehicle{

	String brandName;
	int speed;
	
	
	Vehicle(String brandName,int speed){
		this.brandName = brandName;
		this.speed = speed;	
	}
}
class Bike extends Vehicle{
	
	String type;
	
	Bike(String brandName,int speed,String type){
		super(brandName,speed);
		this.type = type;
	}
	public void printBike(){
		System.out.println("Brand Name : "+this.brandName+
				 "\nSpeed : "+this.speed+
				 "\nType : "+this.type);
	}
	public static void main(String args[]){
		Bike obj=new Bike("Hero",120,"Glamour");
		obj.printBike();
	}
}