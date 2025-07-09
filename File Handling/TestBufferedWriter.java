import java.io.*;
class TestBufferedWriter{

	public static void main(String args[])throws IOException{
		FileWriter fw=new FileWriter("Tiger.txt");

		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Welcome");
		bw.newLine();
		bw.write("Hey subha");
		
		
		bw.flush();
		fw.close();
		bw.close();

	}	

}