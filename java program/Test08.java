import java.util.Scanner;
class Test08{
    public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Size :");
	  int size=sc.nextInt();

	  int arr[]=new int[size];

	  for(int index=0;index<arr.length;index++){
		 System.out.println("Enter arr["+index+"] value :");
		 arr[index]=sc.nextInt();
	  }
	  for(int index=0;index<arr.length;index++){
		 System.out.println("arr["+index+"] : "+arr[index]);
	  }
	  System.out.println("------------------");
	  System.out.println("Enter remove index number : ");
	  int remi=sc.nextInt();
	  if(remi<size){
		for(int i=remi;i<arr.length-1;i++){
			arr[i]=arr[i+1];
	 	}
	        for(int index=0;index<arr.length-1;index++){
			System.out.println("arr["+index+"] : "+arr[index]);
		}

	  }else{
			System.out.println("Not a valid index number");
	  }
    }
}