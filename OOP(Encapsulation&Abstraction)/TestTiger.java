class TestTiger{
	
	public static void main(String args[]){
		Tiger t1=new Tiger();

		t1.printTiger();

		t1.setBreedName("Bengal tiger");
		t1.setAge(23);
		t1.setWeight(230.0);
		t1.setHeight(4.3);

		t1.printTiger();
	}
}