class Person{

	String name;
	int age;

	Person(String name,int age){
		this.name = name;
		this.age = age;	
	}
}
class Employee extends Person{

	String id;
	double salary;
	Employee(String name,int age,String id,double salary){
		super(name,age);
		this.id = id;
		this.salary = salary;
	}
	public void printEmployee(){
		System.out.println("[Name : "+this.name+
				   ",Age : "+this.age+
				   ",ID : "+this.id+
				   ",Salary : "+this.salary+"] ");	
	}
	public static void main(String args[]){
		Employee obj=new Employee("Rohit patra",23,"E101",40000.0);
		obj.printEmployee();
	}	
}