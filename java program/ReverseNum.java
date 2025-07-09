import java.util.Scanner;
class ReverseNum{
    public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number");
	 int num=sc.nextInt();
	 int rev=0;
	 while(num!=0){
	     int ld=num%10;
	     rev=rev*10+ld;
	     num=num/10;
	 }
	 System.out.println("Reverse of number is :" +rev);
    }
}