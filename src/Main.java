import java.util.Arrays;

public class Main {
	 static String s = "I love to work in global logic!";
	 static String[] logic = {"l","o","g","i","c"};
	public static void main(String[] args) {
		
		FindCharacters test1 = new FindCharacters(s, logic);
		test1.removeSpecialCharacters();
		test1.seperateWords();
		System.out.println(test1.wordsAndChars);
		test1.findCharactersInWords();
		System.out.println(test1.wordsAndChars +" " +test1.charactersFoundCount );
		test1.Answer();
		}
	}

//TODO
