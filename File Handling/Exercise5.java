import java.io.*;
import java.util.Date;
class Exercise5{

	public static void main(String args[])throws IOException{
		File obj=new File("Tiger.txt");
		Date date=new Date(obj.lastModified());
		System.out.println("The file is last modified on : "+date+"\n");
	}
}