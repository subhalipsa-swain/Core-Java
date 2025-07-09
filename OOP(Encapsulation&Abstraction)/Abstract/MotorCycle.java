abstract class Vehicle{
	
	public abstract void startEngine();
	public abstract void stopEngine();
}
class Car extends Vehicle{

	public void startEngine(){
		System.out.println("Engine start in car");
	}
	public void stopEngine(){
		System.out.println("Engine stop in car");
	}
}
class MotorCycle extends Vehicle{

	public void startEngine(){
		System.out.println("Engine start in Motor Cycle");
	}
	public void stopEngine(){
		System.out.println("Engine stop in Motor Cycle");
	}
	public static void main(String args[]){
		MotorCycle obj1=new MotorCycle();
		obj1.startEngine();
		obj1.stopEngine();
		Car obj2=new Car();
		obj2.startEngine();
		obj2.stopEngine();
	}
}