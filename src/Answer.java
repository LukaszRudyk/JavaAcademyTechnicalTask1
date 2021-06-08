import java.io.IOException;
import java.util.Arrays;

public class Answer {

	/**
	 * 
	 * @param inputPhrase takes input string to find characters
	 * @param charactersToFind word with characters to find from
	 * @throws IOException
	 * 
	 * 
	 * 
	 * static method answer uses algorithm from FindCharacters.java outputs answer and writes it to file
	 */
	
	

	static void answer(String inputPhrase,String[] charactersToFind) throws IOException
	{
		FindCharacters test1 = new FindCharacters(inputPhrase, charactersToFind);
		test1.removeSpecialCharacters();
		test1.seperateWords();
		
		test1.findCharactersInWords();
		
		test1.Answer();
		FileMenager answer = new FileMenager("Answers.txt");
		answer.createFile();
		answer.writeToFile("input phrase = "+inputPhrase+"   charachters = "+Arrays.toString(charactersToFind) + "\n"+test1.Answer());		
	}
	
}
