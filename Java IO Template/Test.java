/**
* Author : Thiwa
*/
public class Test {
	public static void main(String[] args) {
	
		WriteToFile writeToFile = new WriteToFile();
		try {
			writeToFile.write("temp/log", "info-log.txt", "---- Log Start ---->\n");
		} catch(Exception ex) {
			
		}
		
	}
}