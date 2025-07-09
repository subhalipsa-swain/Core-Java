class Student{
	static String clgName = "BBSR CLG";
	String name;
	String roll;
	int age;
	String add;

	Student(String n,String r,int ag,String ad){
		name=n;
		roll=r;
		age=ag;
		add=ad;
	}
	public static void main(String args[]){
		Student s1=new Student("Subha Swain","1002AD",21,"BBSR");

		System.out.println("college Name : "+Student.clgName);
		System.out.println("Name : "+s1.name);
		System.out.println("Roll no : "+s1.roll);
		System.out.println("Age : "+s1.age);
		System.out.println("Address : "+s1.add);
	}
}