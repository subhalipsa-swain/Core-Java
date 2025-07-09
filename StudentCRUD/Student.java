public class Student{
	private String name;
	private String roll;
	private int age;
	private String add;

	public void setName(String name){
		this.name=name;
	}
	public void setRoll(String roll){
		this.roll=roll;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setAdd(String add){
		this.add=add;
	}
	public String getName(){
		return this.name;
	}
	public String getRoll(){
		return this.roll;
	}
	public int getAge(){
		return this.age;
	}
	public String getAdd(){
		return this.add;
	}
	public String toString(){
		return "[Name : "+this.name+",Roll : "+this.roll+",Age : "+this.age+",Add : "+this.add+"]";
	}
}