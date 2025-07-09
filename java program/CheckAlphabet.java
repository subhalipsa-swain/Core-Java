import java.util.Scanner;
class CheckAlphabet{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a character");
      char ch=sc.nextChar();
      
      if(ch>='A'&& ch<='Z'){
         System.out.println("char is an alphabet");
      }else{
         System.out.println("char is not an alphabet");
      }
   }
}
