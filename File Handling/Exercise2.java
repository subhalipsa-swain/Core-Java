import java.io.*;
class Exercise2{

	public static void main(String args[])throws IOExecption{
		File file=new File("D:/File Handling");
		String[] list=file.list();
		public boolean accept(){
			if(name.toLowerCase().endsWith(".class")){
				return true;
			}else{
				return false;
			}
			for(String f:list){
				System.out.println(f);
			}
		}
	}
}