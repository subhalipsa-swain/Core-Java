class Test09{
    public static void main(String args[]){
	  int x[]= {34,22,12,45,78,66};
	  boolean b=false;
	  int search = 22;
	  for(int i=0;i<x.length;i++){
		if(x[i]==search){
			b=true;
			break;
		}
	  }
	  if(b==true){
		System.out.println("Element is present");
	  }else{
		System.out.println("Element is not present");
	  }
    }
}