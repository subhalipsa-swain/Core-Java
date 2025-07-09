class Parent{
	int x=90;
	
	public void m(){
		System.out.println("Parent Method");
	}
}
class Child extends Parent{
	int y=80;
	public void m(){
		System.out.println("Child Method");
	}
	public static void main(String args[]){
		Child cld=new Child();
		System.out.println("Through Child : "+cld.y);
		cld.m();
	}
}