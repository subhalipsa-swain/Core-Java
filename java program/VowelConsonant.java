import java.util.Scanner;
class VowelConsonant{
   public static void main(String args[]){
      Scanner sc=newScanner(System.in);
      System.out.println("Enter an Alphabet");
      char ch=scanner.next().charAt(0);

      if((ch == 'a' && ch == 'e' && ch == 'i' && ch == 'o' && ch == 'u' && ch == 'A' && ch == 'E' && ch == 'I' && ch == 'O' && ch == 'U' )){
          System.out.println(ch +"is a vowel");
      }else if((ch>='a'&& ch<='z')|| (ch>='A' && ch<='Z')){
          System.out.println(ch +"is a consonsnt");
       } 
   }
}