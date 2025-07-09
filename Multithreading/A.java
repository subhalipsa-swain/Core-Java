class A implements Runnable{

	public void run(){
		System.out.println("Hyy");
	}
	public static void main(String args[]){
		A obj=new A();
		Thread t1=new Thread(obj);
		t1.start();
	}
}