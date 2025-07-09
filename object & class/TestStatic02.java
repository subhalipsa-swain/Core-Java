class TestStatic02{
	static int x;
	static int y=30;
	static int z;
	static{
		z=90;
	}
	static int f=z;
	static int u=z+f;

	static int h=TestStatic02.m1();

	static int m1(){

		return 69;
	}

     public static void main(String args[]){
	System.out.println("x : "+TestStatic02.x);
	System.out.println("y : "+TestStatic02.y);
	System.out.println("z : "+TestStatic02.z);
	System.out.println("f : "+TestStatic02.f);
	System.out.println("u : "+TestStatic02.u);
	System.out.println("h : "+TestStatic02.h);
     }

	
}