class Animal{

	public void makeSound(){
		System.out.println("Animal is Barking");
	}
}
class Dog extends Animal{

	public void makeSound(){
		System.out.println("Dog is Barking");
	}
	public static void main(String args[]){
		Dog d1=new Dog();
		d1.makeSound();
	}
}