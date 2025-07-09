abstract class Shape2D{

	public abstract void draw();
	public abstract void resize();
}
class Rectangle extends Shape2D{

	public void draw(){
		System.out.println("Draw a rectangle");
	}
	public void resize(){
		System.out.println("Resize the rectangle");
	}
}
class Circle extends Shape2D{

	public void draw(){
		System.out.println("Draw a Circle");
	}
	public void resize(){
		System.out.print("Resize a Circle");
	}
	public static void main(String args[]){
		Circle obj1=new Circle();
		obj1.draw();
		obj1.resize();
		Rectangle obj2=new Rectangle();
		obj2.draw();
		obj2.resize();
	}
}