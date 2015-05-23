import java.io.BufferedReader;
import java.io.FileReader;

public class stringManip {
	String fileName = "C:\\Users\\David\\Desktop\\iTunes.txt";
	String line;
	//int numberOfLines = 0;
	//int y = 0;
	
	public void openFile() {
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while ((line = bufferedReader.readLine()) != null) {
				//numberOfLines++;
				//System.out.println(numberOfLines);
			}
				bufferedReader.close();
		}
		catch (Exception e){
			System.out.println("Could not find file.");
		}
		
	}
}
