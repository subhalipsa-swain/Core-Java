class TestLion{
	public static void main(String args[]){
		Lion l1=new Lion();

		l1.printLion();
		
		l1.setBreedName("African lion");
		l1.setAge(22);
		l1.setWeight(230.0);
		l1.setHeight(4.5);
		
		l1.printLion();
	}
}