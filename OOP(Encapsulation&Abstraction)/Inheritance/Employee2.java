class person{

	String firstName;
	String lastName;

	person(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
}
class Employee2 extends Person{

	String employeeId;
	String jobTitle;

	Employee2(String firstName,String lastName,String employeeId,String jobTitle){
		super(firstName,lastName);
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}
	public String getEmployeeId(){
		return employeeId;
	}
	public String getLastName(){
		return super.getLastName()+ "," +jobTitle;
	}
	public static void main(String args[]){
		Employee2 obj=new Employee2("Subhalipsa","Swain","4451D","HR Manager");
		System.out.println(obj.getFirstName()+ " " +obj.getLastName() " (" +obj.getEmployeeId() ")");
	}
}