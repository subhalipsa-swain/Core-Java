class Employee{
	String empName;
	int empID;
	String empEmail;
	String empPass;
	String empAdd;

	Employee(){
		this("hhh",99,"uuuuu");
		System.out.println("No param cons");
	}
	Employee(String empName,int empID,String empEmail){
		this("hhh",99,"uuuuu","tttt","rrrr");
		System.out.println("3-param cons");
	}
	Employee(String empName,int empID,String empEmail,String empPass,String empAdd){
		System.out.println("5-param cons");
	}
	public static void main(String args[]){
		Employee obj=new Employee();
	}
}