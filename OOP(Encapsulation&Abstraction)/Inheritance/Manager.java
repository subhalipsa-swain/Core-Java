class Employee{

	String employeeName;
	double salary;

	Employee(String employeeName,double salary){
		this.employeeName = employeeName;
		this.salary = salary;
	}
}
class Manager extends Employee{

	String department;
	
	Manager(String employeeName,double salary,String department){
		super(employeeName,salary);
		this.department = department;
	}
	public void printEmployee(){
		System.out.println("Employee Name : "+this.employeeName+
				   "\nSalary : "+this.salary+
				   "\nDepartment Of : "+this.department);
	}
	public static void main(String args[]){
		Manager obj=new Manager("Bharat kumar Mishra",50000.0,"Accounting");
		obj.printEmployee();
	}
}