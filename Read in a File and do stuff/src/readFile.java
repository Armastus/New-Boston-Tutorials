import java.io.*;
import java.util.Scanner;

public class readFile {
	private Scanner x;
	//Open File
	String fileName = "C:\\Users\\David\\Desktop\\iTunes.txt";
	//Reference one line at a time.
	String line;
	
	
	public void openFile() {
		try {
			x = new Scanner (new File(fileName));
			// FileReader reads text files in default encoding.
			FileReader fileReader = new FileReader(fileName);
			
			//Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			//Close File.
			bufferedReader.close();
			
			while(x.hasNext()){
				//this will loop through each individual string and
				//make it equal to a, b and c.
				//This will also format to output each file in threes.
				String a = x.next();
				String b = x.next();
				String c = x.next();
				
				System.out.printf("%s %s %s\n", a, b, c);
			}
			x.close();
		}
		catch(Exception e){
			System.out.println("Could not find file.");
		}
	}
}
