class B extends Thread{

	public void run(){
		System.out.println("Bye");
	}
	public static void main(String args[]){
		B t1=new B();
		t1.start();
		
		B t2=new B();
		t2.start();
	}
}