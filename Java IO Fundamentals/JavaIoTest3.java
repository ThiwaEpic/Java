import java.util.Scanner;

/**
*
* Improve initial program using scanner
*
*/
public class JavaIoTest3 {
	public static void main(String[] args) {
			System.out.print("Enter value : ");
			String value = "";
		try {
			Scanner sc = new Scanner(System.in);
			
			value = sc.next();
		} catch (Exception io) {
			
		}
		System.out.println("Entered value : " + value);
	}
}