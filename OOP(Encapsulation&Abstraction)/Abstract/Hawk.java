abstract class Bird{

	public abstract void fly();
	public abstract void makeSound();
}
class Eagle extends Bird{

	public void fly(){
		System.out.println("Eagle flyies");
	}
	public void makeSound(){
		System.out.println("Eagle make Sound");
	}
}
class Hawk extends Bird{

	public void fly(){
		System.out.println("Hawk flyies");
	}
	public void makeSound(){
		System.out.println("Hawk make Sound");
	}
	public static void main(String args[]){
		Hawk obj1=new Hawk();
		obj1.fly();
		obj1.makeSound();
		Eagle obj2=new Eagle();
		obj2.fly();
		obj2.makeSound();
	}
}
