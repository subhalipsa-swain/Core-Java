import java.util.Scanner;
class Test14{
    public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter rowsize : ");
	  int rowsize=sc.nextInt();
	  System.out.println("Enter colsize : ");
	  int colsize=sc.nextInt();
	  int temp=0;

	  int x[][]=new int[rowsize][colsize];
	  for(int row=0;row<rowsize;row++){
		for(int col=0;col<colsize;col++){
			System.out.println("Enter value of x["+row+"]["+col+"] :");
			x[row][col]=sc.nextInt();

		System.out.println("Duplicate elements :");
                temp=x[0][0];
		 for(int row=0;row<size;row++){
			if(temp==rowsize){
			    System.out.println( +rowsize);
		   for(int col=0;col<size;col++){
			if(temp==colsize){
			    System.out.println( +colsize);
			}
		   }
		}
	  }
    }
}