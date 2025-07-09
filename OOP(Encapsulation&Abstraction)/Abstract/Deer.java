abstract class Animal{

	public abstract void eat();
	public abstract void sleep();
}
class Lion extends Animal{

	public void eat(){
		System.out.println("Lion is eating");
	}
	public void sleep(){
		System.out.println("Lion is sleeping");
	}
}
class Tiger extends Animal{

	public void eat(){
		System.out.println("Tiger is eating");
	}
	public void sleep(){
		System.out.println("Tiger is sleeping");
	}
}
class Deer extends Animal{
	
	public void eat(){
		System.out.println("Deer is eating");
	}
	public void sleep(){
		System.out.println("Deer is sleeping");
	}
	public static void main(String args[]){
		Deer obj1=new Deer();
		obj1.eat();
		obj1.sleep();
		Tiger obj2=new Tiger();
		obj2.eat();
		obj2.sleep();
		Lion obj3=new Lion();
		obj3.eat();
		obj3.sleep();
	}
}