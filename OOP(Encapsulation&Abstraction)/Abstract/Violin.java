abstract class Instrument{

	public abstract void play();
	public abstract void tune();
}
class Glokenspiel extends Instrument{

	public void play(){
		System.out.println("Play Glokenspiel");
	}
	public void tune(){
		System.out.println("Tunning of Glokenspiel");
	}
}
class Violin extends Instrument{

	public void play(){
		System.out.println("Play Violin");
	}
	public void tune(){
		System.out.println("Tunning of Violin");
	}
	public static void main(String args[]){
		Violin obj1=new Violin();
		obj1.play();
		obj1.tune();
		Glokenspiel obj2=new Glokenspiel();
		obj2.play();
		obj2.tune();
	}
}