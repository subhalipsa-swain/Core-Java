import java.io.*;
class PrintWriter{

	public static void main(String args[])throws IOException{
		FileWriter fw=new FileWriter("Tiger.txt");
		
		PrintWriter pw=new PrintWriter(fw);

		pw.println("Hyy");
		pw.println(100);
		pw.println(12.09);
		pw.flush();
		
		fw.close();
		pw.close();
	}
}