import java.io.IOException;
import java.util.Arrays;

public class Answer {

	
	static void answer(String inputPhrase,String[] charactersToFind) throws IOException
	{
		FindCharacters test1 = new FindCharacters(inputPhrase, charactersToFind);
		test1.removeSpecialCharacters();
		test1.seperateWords();
		System.out.println(test1.wordsAndChars);
		test1.findCharactersInWords();
		System.out.println(test1.wordsAndChars +" " +test1.charactersFoundCount );
		test1.Answer();
		FileMenager answer = new FileMenager("Answers.txt");
		answer.createFile();
		answer.writeToFile("input phrase = "+inputPhrase+"   charachters = "+Arrays.toString(charactersToFind) + "\n"+test1.Answer());		
	}
	
}
