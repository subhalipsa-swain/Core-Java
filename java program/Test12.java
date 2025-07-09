class Test12{
    public static void main(String args[]){
	 
    	int[] arr1={1,2,3,4,5};
	int[] arr2=new int[arr1.length];

	for(int i=0;i<arr1.length;i++){
		arr2[i]=arr1[i];
        }
	System.out.println("Elements of original array");
	for(int i=0;i<arr1.length;i++){
		System.out.println( +arr1[i]);
	}
	System.out.println("--------------");
	
	System.out.println("Elements of copy array");
	for(int i=0;i<arr2.length;i++){
		System.out.println( +arr2[i]);
	}
   }	      
}