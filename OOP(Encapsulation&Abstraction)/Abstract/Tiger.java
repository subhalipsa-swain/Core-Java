abstract class Animals{

	public abstract void sound();
}
class Lion extends Animals{

	public void sound(){
		System.out.println("Lion make Sound");
	}
}
class Tiger extends Animals{

	public void sound(){
		System.out.println("Tiger make Sound");
	}
	public static void main(String args[]){
		Lion obj1=new Lion();
		obj1.sound();
		Tiger obj2=new Tiger();
		obj2.sound();
	}
}
