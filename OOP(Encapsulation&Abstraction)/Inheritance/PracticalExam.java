class Exam{

	String subject = "Mathematics";
	int totalMarks = 100;

	public void examDetails(){
		System.out.println("Subject : "+subject);
		System.out.println("Total Marks : "+totalMarks);
	}
}
class PracticalExam extends Exam{

	int labNumber = 102;
	
	public void examDetails(){
		System.out.println("Subject : "+subject);
		System.out.println("Total Marks : "+totalMarks);
		System.out.println("Lab Number : "+labNumber);
	}
	public static void main(String args[]){
		PracticalExam obj=new PracticalExam();
		obj.examDetails();
	}
}