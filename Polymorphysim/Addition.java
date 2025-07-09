class Addition{
	//Overloading
	public void add(int x,int y){
		int res = x+y;
		System.out.println("Res : "+res);
	}
	public void add(double x,double y){
		double res = x+y;
		System.out.println("Res : "+res);
	}
	public void add(float x,float y){
		float res =x+y;
		System.out.println("Res : "+res);
	}
	public void add(char x,char y){
		int res = x+y;
		System.out.println("Res : "+res);
	}
	public void add(String x,String y){
		String res = x+y;
		System.out.println("Res : "+res);
	}
	public static void main(String args[]){
		Addition obj=new Addition();
		
		obj.add(20,19);
		obj.add("Hyy","Bye");
		obj.add(12.0,22.89);
	}
}