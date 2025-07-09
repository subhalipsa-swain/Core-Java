// Herarichal Inheritance
class WW{

	int x=80;
}
class AA extends WW{

	int y=90; 
}
class FF extends WW{

	public static void main(String args[]){
		FF obj=new FF();
		System.out.println(obj.x);
	//	System.out.println(obj.y);
		AA o=new AA();
		System.out.println(o.y);
	}
}