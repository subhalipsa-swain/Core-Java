import java.util.ArrayList;
class Test10{
	public static void main(String args[]){
		ArrayList al=new ArrayList<>();

		al.add("HY");
		al.add('P');
		al.add(200);
		al.add(false);
		al.add(10.07f);
		al.add(101.08);
		al.add(222211);

		System.out.println(al.toString());
	}
}