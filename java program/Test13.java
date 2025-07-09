import java.util.Scanner;
class Test13{
   public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a rowsize");
	int rowsize=sc.nextInt();
	System.out.println("Enter a colsize");
	int colsize=sc.nextInt();

	int x[][]=new int[rowsize][colsize];
	

	for(int row=0;row<rowsize;row++){
		for(int col=0;col<colsize;col++){
	          	System.out.println("Enter value of x["+row+"]["+col+"] : ");	
			x[row][col]=sc.nextInt();
		}
	}
	for(int row=0;row<rowsize;row++){
		for(int col=0;col<colsize;col++){
			System.out.println("x["+row+"]["+col+"] : "+x[row][col]);
		}
	}

   }
}