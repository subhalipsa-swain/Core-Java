import java.io.*;
class Test01{
	
	public static void main(String args[])throws IOException{
		File f = new File("abc.pdf");
		boolean res1 = f.createNewFile();   	 //create file
		System.out.println(res1);

		File d = new File("Subha"); 
		boolean res2 = d.mkdir();           	//create folder
		System.out.println(res2);

		System.out.println(f.exists()); 	// check file exists or not
		System.out.println(d.exists()); 	//check folder exists or not
	}
}