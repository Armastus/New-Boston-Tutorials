import java.util.*;

public class createFile {
	public static void main(String[] args) {
		//Formatter variables print a file.
		final Formatter createFile;
		
		//Exception Handling
		try{
			createFile = new Formatter("C:\\Users\\David\\Desktop\\I'm a file!.docx");
			System.out.println("You created a file");
		}
		catch(Exception e) {
			System.out.println("You didn't create a file, boo.");
		}
	}
}
