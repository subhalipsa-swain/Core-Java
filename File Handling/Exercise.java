import java.io.*;
class Exercise{

	public static void main(String args[])throws IOException{
		File file=new File("D:/File Handling");
		String[] fileList=file.list();
		for(String name:fileList){
			System.out.println(name);
		}
	}
}