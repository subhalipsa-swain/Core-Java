abstract class Person{

	public abstract void eat();
	public abstract void exercise();
}
class Athlete extends Person{

	public void eat(){
		System.out.println("Person eating");
	}
	public void exercise(){
		System.out.println("Person doing exercise");
	}
}
class LazyPerson extends Person{

	public void eat(){
		System.out.println("That Person is eating");
	}
	public void exercise(){
		System.out.println("Person is not doing exercise");
	}
	public static void main(String args[]){
		LazyPerson obj1=new LazyPerson();
		obj1.eat();
		obj1.exercise();
		Athlete obj2=new Athlete();
		obj2.eat();
		obj2.exercise();
	}

}