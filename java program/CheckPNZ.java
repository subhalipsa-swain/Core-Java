import java.util.Scanner;
class CheckPNZ{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter value of no");
      int n=sc.nextInt();

      if(n>0){
        System.out.println("no is positive");
      }else if(n<0){
        System.out.println("no is negative");
       }else{
         System.out.println("no is zero");
       }
   }
}