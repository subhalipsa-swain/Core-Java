class Tiger{
	
	private String breedName;
	private int age;
	private double weight;
	private double height;

	public void setBreedName(String breedName){
		this.breedName = breedName;
	}
	public String getBreedName(){
		return this.breedName;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return this.weight;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return this.height;
	}

	public void printTiger(){
		System.out.println("[Name : "+this.breedName+
				   ",Age : "+this.age+
				   ",Weight : "+this.weight+
				   ",Height : "+this.height+"] ");
	}
}