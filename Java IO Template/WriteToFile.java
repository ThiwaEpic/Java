import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
* Author : Thiwa@Epic
*/
public class WriteToFile {
	/**
	*
	* File name = fileLocation + fileName
	* message = msg
	*
	*/
	public void write(String fileName, String msg) throws IOException {
		
		try {
			File file = new File(fileName);
		
			// check weather file is exist
			if(!file.exists()) {
				file.createNewFile();
			} else {}
			
			// appending message into file
			FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.append(msg);
			bufferedWriter.close();
			
		} catch(IOException io) {
			io.printStackTrace();
		}
		
	}
	
	/**
	*
	* File location = fileLocation
	* File name = fileName
	* message = msg
	*
	*/
	public void write(String fileLocation, String fileName, String msg) throws IOException {
		
		try {
			File file = new File(fileLocation + File.separator + fileName);
		
			// check weather file is exist
			if(!file.exists()) {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} else {}
			
			// appending message into file
			FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.append(msg);
			bufferedWriter.close();
			
		} catch(IOException io) {
			io.printStackTrace();
		}
		
	}
}