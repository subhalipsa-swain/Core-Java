import java.util.Scanner;
class Test06{
    public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter size :");
	 int size=sc.nextInt();

	 int arr[]=new int[size];

	 for(int index=0;index<arr.length;index++){
	      System.out.println("Enter arr["+index+"] Value :");
	      arr[index]=sc.nextInt();
	 }
	 for(int index=0;index<arr.length;index++){
	      System.out.println("arr["+index+"] : "+arr[index]);
	 }
	 System.out.println("----------------");
	 
	 int res=0;
	 for(int i=0;i<arr.length;i++){
	      res=res+arr[i];
	 }
	 System.out.println("Sum of elements is : "+res);
    }
}