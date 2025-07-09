import java.util.Scanner;

class StudentCRUD{
	private Scanner sc;
	private Student[] students;
	private int count;

	StudentCRUD(){
		students=new Student[100];
		sc=new Scanner(System.in);
		count=0;
	}
	public void start(){
		int choice;
		do{
			System.out.println("1-Add data\n2-View data\n3-Update data\n4-Delete data");
			System.out.println("Enter choice :");
			choice=sc.nextInt();
			sc.nextLine();

			switch(choice){
				case 1:{
					addData();
					break;
				}
				case 2:{
					viewData();
					break;
				}
				case 3:{
					System.out.println("Update Data");
					break;
				}
				case 4:{
					System.out.println("Delete Data");
					break;
				}
				default : System.out.println("Enter valid choice");
			}
		}while(true);
	}
	public static void main(String args[]){
		StudentCRUD app=new StudentCRUD();
		app.start();
	}

	private void addData(){
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		System.out.println("Enter Roll : ");
		String roll=sc.nextLine();
		System.out.println("Enter Age : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Add : ");
		String add=sc.nextLine();

		Student student=new Student();
		student.setName(name);
		student.setRoll(roll);
		student.setAge(age);
		student.setAdd(add);

		students[count++]=student; 
		System.out.println("Student Data Added Successfully!");
	}
	private void viewData(){
		if(count==0){
			System.out.println("No Data Found!");
		}else{
			for(int i=0;i<count;i++){
				System.out.println(students[i]);
			}
		}
	}
	private void updateData(){
		System.out.println("Enter Name to Update Data");
		String name=sc.nextLine();
	}
} 