class Bank{
	String name;
	String accountNo;
	String IFSCCode; 

     void deposit(){
	 System.out.println("Money Deposit");
     }
     void withdraw(){
	 System.out.println("Money Withdraw");
     }
     public static void main(String args[]){
	 Bank b1=new Bank();

	 b1.name="Subhalipsa Swain";
	 b1.accountNo="234567894567";
	 b1.IFSCCode="BNFS2004567";

	 System.out.println("Name : "+b1.name);
	 System.out.println("Account No : "+b1.accountNo);
	 System.out.println("IFSC Code : "+b1.IFSCCode);

	 System.out.println("--------------------");
	 Bank b2=new Bank();

	 b2.name="Priyabrat Nayak";
	 b2.accountNo="2468345687699";
	 b2.IFSCCode="BNDF3009834";

  	 System.out.println("Name : "+b2.name);
	 System.out.println("Account No : "+b2.accountNo);
	 System.out.println("IFSC Code : "+b2.IFSCCode);
     }
}