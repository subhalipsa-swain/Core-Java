class Animal{
	String name;
	float height;
	String weight;

    void walk(){
	System.out.println("They can walk");
    }

    void sleep(){
	System.out.println("They can sleep");
    }

    void eat(){
	System.out.println("They can eat");
    }
    public static void main(String arg[]){
	Animal a1=new Animal();

	a1.name="Dog";
	a1.height=3.3f;
	a1.weight="30kg";

	System.out.println("Animal 1");
	System.out.println("Name : "+a1.name);
	System.out.println("Height : "+a1.height);
	System.out.println("Weight : "+a1.weight);

	System.out.println("---------------");

	Animal a2=new Animal();

	a2.name="Cat";
	a2.height=2.3f;
	a2.weight="25kg";

	System.out.println("Animal 2");
	System.out.println("Name : "+a2.name);
	System.out.println("Height : "+a2.height);
	System.out.println("Weight : "+a2.weight);
    }	
}