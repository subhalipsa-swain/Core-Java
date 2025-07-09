class TestStudent{
	public static void main(String args[]){
		Student s1=new Student();

		s1.printStudent();
		
		s1.setName("Subha Swain");
		s1.setRoll("100AD");
		s1.setAge(21);
		s1.setAdd("BBSR");

		s1.printStudent();

		String roll=s1.getRoll();
		System.out.println(roll);

		System.out.println(s1.getRoll());
	}
}