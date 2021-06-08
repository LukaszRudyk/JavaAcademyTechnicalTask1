import java.util.Scanner;

public class InputString {

public static String inputPhrase ;

/**
 * read string from user
 */
public static Scanner scanner = new Scanner(System.in);


public static String  inputPhrase() {
	
	inputPhrase = scanner.nextLine();
	return inputPhrase;
}




}
