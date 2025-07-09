import java.io.*;
class Exercise4{

	public static void main(String args[])throws IOException{
		File obj=new File("D:/File Handling/Tiger.txt");
		if(obj.isDirectory()){
			System.out.println(obj.getAbsolutePath()+" is a directory\n");
		}else{
			System.out.println(obj.getAbsolutePath()+" is not a directory\n");
		}
		if(obj.isFile()){
			System.out.println(obj.getAbsolutePath()+" is a File\n");
		}else{
			System.out.println(obj.getAbsolutePath()+" is not a File\n");
		}
	}
}