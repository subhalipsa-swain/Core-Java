import java.util.Scanner;
class Palindrome{
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int num=sc.nextInt();
	  int temp=num;
	  int rev=0;
	  while(num!=0){
             int ld=num%10;
	     rev=rev*10+ld;
	     num=num/10;
	  }

	  if(temp==rev){
	      System.out.println("Num is Palindrome");    
	  }else{
	      System.out.println("Num is not Palindrome");
	  }
     }
}