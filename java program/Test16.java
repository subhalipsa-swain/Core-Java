class Test16{
    public static void main(String args[]){
	 int size=8;
	 int x[] = new int[size];
	 
	 x[0]=22;
	 x[1]=33;
	 x[2]=44;
	 x[3]=55;
	 x[4]=11;
	 x[5]=45;
	 x[6]=66;

	 for(i=0;i<x.length;i++){
		System.out.println("x["+i+"] : "+x[i]);
	 }
	 int pos=7;
	 int newElement=90;

	 for(i=x.length-1;i>pos;i--){
	 	x[i]=x[i-1];
	 }
	 x[pos]=newElement;

	 System.out.println("--------------");

	 for(i=0;i<x.length;i++){
		System.out.println("x["+i+"] : "+x[i]);
	 }
    }
}