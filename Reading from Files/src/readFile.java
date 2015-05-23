import java.io.*;
import java.util.*;

public class readFile {
	private Scanner x;
	
	public void openFile(){
		try{
			x = new Scanner (new File("Hi.txt"));
		}
		catch(Exception e){
			System.out.println("Could not find file.");
		}
	}
	
	public void readtheFile(){
		while(x.hasNext()){
			//this will loop through each individual string and
			//make it equal to a, b and c.
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s\n", a, b, c);
		}
	}
	public void closeFile() {
		x.close();
	}
}
