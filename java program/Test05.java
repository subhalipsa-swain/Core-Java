class Test05{
    public static void main(String args[]){
	 int num=30;
	 int even=0;
	 int odd=0;
	 int i=1;
	 do{
		if(i%2==0){
		   even++;
		   System.out.println(i+" is even");
		}else{
		   odd++;
		   System.out.println(i+" is odd");
		}
	       i++;
	 }while(i<=num);
	 System.out.println("Even count : "+even);
	 System.out.println("Odd count : "+odd);
    }
}