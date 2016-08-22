import java.io.PrintStream;
import java.io.FileNotFoundException;

/**
*
* Redirect standard output into file
*
*/
public class JavaIoTest4 {
	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream("log_info.txt");
			System.setOut(ps);
			System.out.println("Hi hello\nFrom console text!!!");
		} catch(FileNotFoundException fn) {
			fn.printStackTrace();
		}
		
	}
}