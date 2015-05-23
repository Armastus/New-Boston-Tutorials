import java.io.*;
import java.util.*;

public class createFile {
		
		private Formatter makeFile;
		
		public void openFile(){
			try{
				makeFile = new Formatter("Hi.txt");
				System.out.println("File created!");
			}
			catch (Exception e){
				System.out.println("File wasn't created");
			}
		}
		
		public void addRecords() {
			makeFile.format("%s%s%s", "32 ", "David ", "Bustillos\n");
			makeFile.format("%s%s%s", "28 ", "Skippy ", "McDoobles\n");
			makeFile.format("%s%s%s", "39 ", "Bleep ", "Bloop\n");
			makeFile.format("%s%s%s", "20 ", "Pippy ", "Peppers");
		}
		
		public void closeFile(){
			makeFile.close();
		}
}