class Minimum{
	
	public void getMinNum(int a,int b,int c){
		if(a<b && a<c){
			System.out.println("a is Smallest Number");
		}else if(b<a && b<c){
			System.out.println("b is Smallest Number");
		      }else{
			System.out.println("c is Smallest Number");
		      }
		}
	}
	public static void main(String args[]){
		Minimum m1=new Minimum();

		System.out.println("Input the first no");
		System.out.println("Input the second no");
		System.out.println("Input the third no");

		m1.getMinNum();	
	}

}