import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
*
* Improve initial program using buffered reader
*
*/
public class JavaIoTest2 {
	public static void main(String[] args) {
			System.out.print("Enter value : ");
			String value = "";
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			// since System.in return input stream, read() can use. read() is method of InputStream
			value = bf.readLine();
		} catch (IOException io) {
			
		}
		System.out.println("Entered value : " + value);
	}
}