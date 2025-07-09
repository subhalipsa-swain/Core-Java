class Course{

	String courseName = "Core java";
	String duration = "3 Months";

	public void courseDetails(){
		System.out.println("Course Name : "+courseName);
		System.out.println("Duration : "+duration);
	}
}
class OnlineCourse extends Course{

	String platformName = "W3schools";
	
	public void courseDetails(){
		System.out.println("Course Name : "+courseName);
		System.out.println("Duration : "+duration);
		System.out.println("Platform Name : "+platformName);
	}
	public static void main(String args[]){
		OnlineCourse obj=new OnlineCourse();
		obj.courseDetails();	
	}
}