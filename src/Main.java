import java.io.IOException;
import java.util.Arrays;

public class Main {
	 static String s = "I love to work in global logic!";
	 static String[] logic = {"l","o","g","i","c"};
	public static void main(String[] args) throws IOException {
		
		Answer.answer(s,logic);
		System.out.println("give me phrase");
		s=InputString.inputPhrase();
		System.out.println("give me word");
		logic =  InputString.inputPhrase().split("");
		Answer.answer(s,logic);
		
		}
	}

//TODO
