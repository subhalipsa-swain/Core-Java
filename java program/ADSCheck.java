import java.util.Scanner
class ADSCheck{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a character");
      char ch=scanner.nextChar();
    
      if((ch>='a' && ch<='z')||(char>='A' && ch<='Z')){
         System.out.println("character is an alphabet");
      }else if(ch>='0' && ch<='9'){
         System.out.println("character is a digit");
       }else{
         System.out.println("Character is a special character");
       }
   }
}