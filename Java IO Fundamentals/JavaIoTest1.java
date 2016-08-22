import java.io.IOException;

public class JavaIoTest1 {
	public static void main(String[] args) {
			System.out.print("Enter value : ");
			int value = 0;
		try {
			// since System.in return input stream, read() can use. read() is method of InputStream
			value = System.in.read();
		} catch (IOException io) {
			
		}
		System.out.println("Entered value : " + value);
	}
}