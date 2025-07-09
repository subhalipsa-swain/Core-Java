class TestStatic03{

	int f;
	{
		f=70;
		System.out.println("Non-Static block executed");
	}
	
	static int x=90;

	static int y;

	static{
		y=80;
		System.out.println("Static block executed,y got the Memory");
	}

	public static void main(String args[]){
		System.out.println("Main method start");
		System.out.println("x : "+TestStatic03.x);
		System.out.println("y : "+TestStatic03.y);
		System.out.println("s : "+TestStatic03.s);

		TestStatic03 obj1=new TestStatic03();

		TestStatic03 obj2=new TestStatic03();

		System.out.println("Main method end");
	}

	static int s;

	static{
		s=45;
		System.out.println("Static block executed,s got the Memory");
	}
}