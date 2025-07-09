class Laptop{
	String brandName;
	String features;
	String price;

    void buyNow(){
	System.out.println(" Product buyNow");
    }
    void exchange(){
	System.out.println("Product exchange");
    }
    void replace(){
	System.out.println("Product replace");
    }

    public static void main(String args[]){
	Laptop l1=new Laptop();

	l1.brandName="Asus";
	l1.features="32gb RAM";
	l1.price="Rs 43000";

	System.out.println("Laptop 1");
	System.out.println("Brand name : "+l1.brandName);
	System.out.println("Features : "+l1.features);
	System.out.println("Price : "+l1.price);

	System.out.println("---------------------");

	Laptop l2=new Laptop();

	l2.brandName="Dell";
	l2.features="16gb RAM";
	l2.price="Rs 56000";

	System.out.println("Laptop 2");
	System.out.println("Brand name : "+l2.brandName);
	System.out.println("Features : "+l2.features);
	System.out.println("Price : "+l2.price);

    }
}