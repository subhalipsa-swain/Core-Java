class Tiger{

	String breedName;
	String name;
	int age;
	double weight;

	public static void main(String args[]){
		Tiger t1=new Tiger();

		t1.breedName = "Bengal Tiger";
		t1.name = "Hari";
		t1.age = 21;
		t1.weight = 230.0;

		System.out.println("Breed Name : "+t1.breedName);
		System.out.println("Name : "+t1.name);
		System.out.println("Age : "+t1.age);
		System.out.println("Weight : "+t1.weight);

		Tiger t2=new Tiger();

		t2.breedName = "Nepal Tiger";
		t2.name = "Raja";
		t2.age = 12;
		t2.weight = 320.0;

		System.out.println("Breed Name : "+t2.breedName);
		System.out.println("Name : "+t2.name);
		System.out.println("Age : "+t2.age);
		System.out.println("Weight : "+t2.weight);
	}
}