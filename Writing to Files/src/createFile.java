import java.io.*;
import java.lang.*;
import java.util.*;

public class createFile {
		
		private Formatter makeFile;
		
		public void openFile(){
			try{
				makeFile = new Formatter("C:\\Users\\David\\Desktop\\Hi.txt");
				System.out.println("File created!");
			}
			catch (Exception e){
				System.out.println("File wasn't created");
			}
		}
		
		public void addRecords() {
			makeFile.format("%s%s%s", "Hey, ", "you printed ", "to a file, woohoo!");
		}
		
		public void closeFile(){
			makeFile.close();
		}
}
