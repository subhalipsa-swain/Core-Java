import java.util.Scanner;
class MonthDays{
    public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Month number");
	 int num=sc.nextInt();

	 if(num==1){
	     System.out.println("January , 31 Days");
         }else if(num==2){
	     System.out.println("February , 28 Days");
	 }else if(num==3){
	     System.out.println("March , 31 Days");   
	 }else if(num==4){
	     System.out.println("April , 30 Days");
 	 }else if(num==5){
	     System.out.println("May , 31 Days");
	 }else if(num==6){
	     System.out.println("June , 30 Days");
	 }else if(num==7){
	     System.out.println("July , 31 Days");
	 }else if(num==8){
	     System.out.println("August , 31 Days");
	 }else if(num==9){
	     System.out.println("September , 30 Days");
	 }else if(num==10){
	     System.out.println("October , 31 Days");
	 }else if(num==11){
	     System.out.println("November , 30 Days");
	 }else if(num==12){
	     System.out.println("December , 31 Days");
	 }else{
	     System.out.println("Please enter a valid month number");
	 }
}