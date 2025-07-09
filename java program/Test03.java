import java.util.Scanner;
class Test03{
    public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Size");
	 int size=sc.nextInt();
	 int y[]={33,44,55,66};
	 System.out.println(y.length);
	 for(int i=0;i<y.length;i++){
	    System.out.println("y["+i+"] = "+y[i]);
	 }
    }
}