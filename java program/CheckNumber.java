import java.util.Scanner;
class CheckNumber{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int n=sc.nextInt();


        if(n%5==0 && n%11==0){
          System.out.println("no is divisble by both 5 and 11");
	  
	}else{
          System.out.println("no is not divisible ");
	}
    }
}
