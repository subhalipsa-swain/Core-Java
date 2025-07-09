class Animal{
	String name;
	int age;
	double weight;
	double height;

	Animal(String name,int age,double weight,double height){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public void printAnimal(){
		System.out.println("Name : "+this.name+
				"\nAge : "+this.age+
				"\nWeight : "+this.weight+
				"\nHeight : "+this.height);
	}
	public static void main(String args[]){
		Animal tiger=new Animal("Bengal tiger",12,320.0,3.4);
		tiger.printAnimal();
	}
}