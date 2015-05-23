import java.io.File;

public class checkForFile {
	public static void main(String[] args) {
		
		File x = new File("C:\\Users\\David\\Desktop\\iTunes.txt");
		
		if(x.exists()){
			System.out.println(x.getName() + " File Exists!");
		}else{
			System.out.println("This file doesn't exist. :-(");
		}
	}
}
