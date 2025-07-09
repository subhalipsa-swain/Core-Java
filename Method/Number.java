import java.util.Scanner;
class Number{
	

	public static void checkPrime(int num){
		boolean isPrime = true;	
		if(num <= 1){
			isPrime = false;
		}else{
			for(int i = 2; i <= Math.sqrt(num); i++){
				if(num % i == 0){
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime){
			System.out.println(num + "is a Prime number");
		}else{
			System.out.println(num + "is not a Prime number");
		}
	}
	public static void getCube(int num){
		if(num>=1){
			System.out.println("Cube of the Number is : "+num*num*num);
		}else{
			System.out.println("Enter a valid number");
		}
	}
	public static void getSquare(int num){
		if(num>=1){
			System.out.println("Square of the Number is : "+num*num);
		}else{
			System.out.println("Enter a valid number");
		}
	}
	public static void checkPosNeg(int num){
		if(num>0){
			System.out.println("Number is Positive");
		}else{
			System.out.println("Number is Negetive");
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println();
			System.out.println("---------------------------");
			System.out.println("1 for check prime number");
			System.out.println("2 for get cube of the number");
			System.out.println("3 for get square of the number");
			System.out.println("4 for check Number is positive or negetive");
			System.out.println("5 for exit");
			System.out.println("---------------------");
			System.out.println();

			System.out.println("Enter choice");
			int choice=sc.nextInt();

		switch(choice){
				case 1:
				        System.out.println("Enter number :");
				        int num1=sc.nextInt();
					Number.checkPrime(num1);
					break;
				case 2:
					System.out.println("Enter Number");
					int num2=sc.nextInt();
					Number.getCube(num2);
					break;
				case 3:
					System.out.println("Enter Number");
					int num3=sc.nextInt();
					Number.getSquare(num3);
					break;
				case 4:
					System.out.println("Enter Number");
					int num4=sc.nextInt();
					Number.checkPosNeg(num4);
					break;
				case 5:
					break;
				default:
					System.out.println("Please Enter a valid Choice!");
			}
		}
	}	
}