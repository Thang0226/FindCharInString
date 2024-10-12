//import java.lang.String;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String str = "Hello World! I am Thang.";
		System.out.println("String: " + str);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = scanner.next().toLowerCase().charAt(0);

		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}

		System.out.println("Number of times character appears in the string: " + count);
	}
}
