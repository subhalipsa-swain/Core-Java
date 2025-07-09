//multi level 
class A{

	int x=70;
}
class B extends A{

	int y=55;
}
class C extends B{

	int z=90;
	public static void main(String args[]){
		C obj=new C();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
	}
}