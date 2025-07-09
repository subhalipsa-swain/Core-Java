interface Shape{

	int x=90;//allowed 
	static int y=23;//allowed
	final int z=80; //allowed
	static{}        //not allowed
	{}              //not allowed
	Shape(){	
	
	}       //not allowed

	static void m1(){}//not allowed
	void m2(){
	
	}

}