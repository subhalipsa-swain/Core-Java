class Bank{
	String accHolderName;
	long accNum;
	double balance;

	public static void getBankDetails(){
		System.out.println("Bank name : SBI");
		System.out.println("IFSC code : SBI2345");
		System.out.println("Bank Add : BBSR");
	}

	public void deposite(double bal){
		if(bal<=0){
			System.out.println("Please enter amount!");
		}else{
			balance=balance+bal;
			System.out.println(bal+"Successfully Deposited!");
		}
	}

	public void withdraw(double bal){
		if(bal<=balance){
			balance=balance-bal;
			System.out.println(bal+"Successfully withdrawal!");
		}else{
			System.out.println("Insufficient Balance : Please try again! ");
		}
	}

	public void getAccDetails(){
		System.out.println("Acc Name : "+accHolderName);
		System.out.println("Acc Num : "+accNum);
		System.out.println("Balance : "+balance);
	}
	
	public static void main(String args[]){
		Bank.getBankDetails();

		Bank person1=new Bank();
		person1.accHolderName = "Subhalipsa Swain";
		person1.accNum = 1123456789;
		person1.deposite(5000.0);
                person1.getAccDetails();

		person1.deposite(2000.0);
		person1.getAccDetails();

		System.out.println("---------------------------");
		Bank.getBankDetails();

		Bank person2=new Bank();
		person2.accHolderName = "Punam Sahoo";
		person2.accNum = 1145638902;
		person2.deposite(1000.0);

		person2.getAccDetails();
		person2.withdraw(500.0);

		person2.getAccDetails();	
	}
}