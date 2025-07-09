import java.util.Scanner;
class UpperLowerCase{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a character");
    char ch=scanner.nextChar();

    if(ch>='a' && ch<='z'){
        System.out.println("Character is a lowercase letter");
    }else if(ch>='A' && ch<='Z'){
        System.out.println("Character is an uppercase letter");
     }else{
        System.out.println("Character is not an alphabet");
      }
  }
}