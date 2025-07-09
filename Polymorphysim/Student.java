class Student extends School{
	
	public void midDayMeal(String meal){
		System.out.println("Child meal : "+meal);
	}
	public static void main(String args[]){
		Student obj=new Student();
		obj.midDayMeal("Rice Soyabeen");
		
	}
}