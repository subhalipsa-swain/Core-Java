import java.io.*;
class Exercise6{

	public static void main(String args[])throws IOException{
		File file=new File("D:/core java/File Handling/Tiger.txt");
		if(file.exists()){
			System.out.println(fileize_in_Bytes(file));
			System.out.println(filesize_in_kiloBytes(file));
			System.out.println(filesize_in_megaBytes(file));
		}else{
			System.out.println("File doesn't exists");
		}
		private static String filesize_in_megaBytes(File file){
			return(double) file.length()/(1024*1024)+" mb";
		}
		private static String filesize_in_kiloBytes(File file){
			return(double)file.length()/1024+" kb";
		}
		private static String filesize_in_Bytes(File file);
			return file.length()+" Bytes";
	}
}