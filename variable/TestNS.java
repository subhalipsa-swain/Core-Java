class TestNS{
	
	int x=45;

	int y;
	{
		System.out.println("N-S Block Executed");
		y=90;
	}
	int z;

	TestNS(){
		System.out.println("N-S Const Executed");
		z=80;
	}
	int s=y;

	public static void main(String args[]){
		System.out.println("Hyy");

		TestNS obj1=new TestNS();
		System.out.println("X : "+obj1.x);
		System.out.println("Y : "+obj1.y);
		System.out.println("Z : "+obj1.z);
		System.out.println("S : "+obj1.s);
	}
}