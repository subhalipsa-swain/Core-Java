import java.io.*;
class Exercise3{

	public static void main(String args[])throws IOException{
		File obj=new File("D:/File Handling/Tiger.txt");
		if(obj.canWrite()){
			System.out.println(obj.getAbsolutePath()+"can write .\n");
		}else{
			System.out.println(obj.getAbsolutePath()+"cannot write.\n");
		}
		if(obj.canRead()){
			System.out.println(obj.getAbsolutePath()+"can read.\n");
		}else{
			System.out.println(obj.getAbsolutePath()+"cannot read.\n");
		}
	}
}