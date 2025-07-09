class Fruit{

	String name = "Orange";
	String colour = "Orange";

	public void fruits(){
		System.out.println("Name : "+name);
		System.out.println("Colour : "+colour);
	}
}
class Citrus extends Fruit{

	public void fruits(){
		System.out.println("Name : "+name);
		System.out.println("Colour : "+colour);
		System.out.println("It has Vitamin C");
	}
	public static void main(String args[]){
		Citrus obj=new Citrus();
		obj.fruits();
	}
}