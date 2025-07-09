import java.util.Scanner;
class Amstrong{
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number");
          int num=sc.nextInt();
          int temp=num;
          int sum=0;
	  while(num!=0){
             int ld=num%10;
	     int cube=ld*ld*ld;
             sum=sum+cube;
             num=num/10;               
          }

          System.out.println(temp==sum?"yes num is Amstrong":"num is not Amstrong");
    }
}