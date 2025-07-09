class Book{

	String title;
	String author;

	Book(String title,String author){
		this.title = title;
		this.author = author;
	}
}
class EBook extends Book{

	int fileSize;
	
	EBook(String title,String author,int fileSize){
		super(title,author);
		this.fileSize = fileSize;
	}
	public void printBook(){
		System.out.println("Title : "+this.title+
				   "\nAuthor : "+this.author+
				   "\nFile Size : "+this.fileSize);
	}
	public static void main(String args[]){
		EBook obj=new EBook("S chand","Laxmir Shing",20);
		obj.printBook();
	}
}