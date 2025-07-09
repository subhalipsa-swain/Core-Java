class Person{
	String name;
	int age;
	String phoneNo;

    void Walk(){
	System.out.println("Person can walk");
    }
    void dance(){
	System.out.println("Person can dance");
    }
    void sing(){
	System.out.println("Person can sing");
    }
    public static void main(String args[]){
		Person p1=new Person();

		p1.name="Rohit patra";
		p1.age=23;
		p1.phoneNo="7873918220";

		System.out.println("Name : "+p1.name);
		System.out.println("Age : "+p1.age);
		System.out.println("Phone no : "+p1.phoneNo);

		System.out.println("------------------");
		Person p2=new Person();

		p2.name="Priyanka Ghos";
		p2.age=25;
		p2.phoneNo="9937971341";

		System.out.println("Name : "+p2.name);
		System.out.println("Age : "+p2.age);
		System.out.println("Phone no : "+p2.phoneNo);
    }
}