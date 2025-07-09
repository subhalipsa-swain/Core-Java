class Animal{

	public void catSound(){
		System.out.println("Meow");
	}
}
class Cat extends Animal{
	
	@Override
	public void catSound(){
		System.out.println("Meow");
	}

	public static void main(String args[]){
		Cat obj=new Cat();
		obj.catSound();
	}
}