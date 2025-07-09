import java.util.Scanner;
class Test11{
    public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a size");
	 int size=sc.nextInt();

	 int x[][]=new int[rowsize][colsize];
	 x[0][0]=20;
	 x[0][1]=17;
	 x[0][2]=14;
	 x[1][0]=10;
	 x[1][1]=9;
	 x[1][2]=8;
	 x[2][0]=28;
	 x[2][1]=13;
	 x[2][2]=12;

	 for(int row=0;row<rowsize;row++){
		for(int col=0;col<colsize;col++){
			System.out.println("x["+row+"]["+col+"] : "+x[row][col]);

		 if(x[row][col]%2==0){
		     System.out.println("Even no :"+x[row][col]);
	        }else{
		     System.out.println("Odd no :"+x[row][col]);
	        }

		}
                
 
	}
	 
    }
}