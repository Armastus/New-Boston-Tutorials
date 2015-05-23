public class apples {
	public static void main(String[] args) {
		
		createFile object = new createFile();
		object.openFile();
		object.addRecords();
		object.closeFile();
	}
}
