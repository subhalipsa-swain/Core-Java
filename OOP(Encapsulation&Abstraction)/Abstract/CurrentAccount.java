abstract class BankAccount{
	
	public abstract void deposite();
	public abstract void withdraw();
}
class SavingsAccount extends BankAccount{

	public void deposite(){
		System.out.println("Money Deposited Succesfully!");
	}
	public void withdraw(){
		System.out.println("Money Withdraw Successfully!");
	}
}
class CurrentAccount extends BankAccount{
	
	public void deposite(){
		System.out.println("Money Deposited Successfully in Current Account");
	}
	public void withdraw(){
		System.out.println("Money Withdraw Successfully from Current Account");
	}
	public static void main(String args[]){
		CurrentAccount obj1=new CurrentAccount();
		obj1.deposite();
		obj1.withdraw();
		SavingsAccount obj2=new SavingsAccount();
		obj2.deposite();
		obj2.withdraw();
	}
}