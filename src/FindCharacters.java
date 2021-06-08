import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;



public class FindCharacters {
private String inputPhrase;
private String[] charactersToFind;
int charactersFoundCount = 0;
int charactersInPhrase = 0;
public  HashMap<String,ArrayList> wordsAndChars ;
/**
 * 
 * @param inputPhrase takes phrase that we want to find characters in 
 * @param charactersToFind array that takes array of characters that we want to find
 */


	public FindCharacters(String inputPhrase,String[] charactersToFind)
	{
		this.inputPhrase = inputPhrase;
		this.charactersToFind=charactersToFind;
		this.wordsAndChars = new HashMap<String,ArrayList>();
		
	}
	
	
	/**
	 * Separates words in inputPhrase and sets them to lower case cause algorithm is case incensitive
	 */
	void seperateWords()
	{
		
		String[] temporary = this.inputPhrase.split(" ");
		for(String string : temporary)
		{
			
			
			this.wordsAndChars.put(string.toLowerCase(),null);
		}
	}
	/**
	 * method removes special characters in input phrase The list of special chars are: ( !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~);
	 */
void removeSpecialCharacters()
{
	this.inputPhrase =this.inputPhrase.replaceAll("[^a-zA-Z0-9]", " ");  
}
	


/**
 * method finds characters from charactersToFind and counts total found characters and sorts map with solution
 * 
 */
	void findCharactersInWords()
	{
		
		for (Entry<String, ArrayList> me : this.wordsAndChars.entrySet()) {
			ArrayList<String> charactersFound = new ArrayList<String>();
	         for(String character : this.charactersToFind)
	         {
	        	if(me.getKey().contains(character))
	        	{
	        		charactersFound.add(character);
	        		
	        		for (int i = 0; i < me.getKey().length(); i++) {
	        		    if (me.getKey().charAt(i) == character.charAt(0)) {
	        		    	this.charactersFoundCount++;
	        		    }
	        		}
	        		    	
	        		
	        		
	        	
	        	}
	        }
	         
	         this.wordsAndChars.put(me.getKey(),charactersFound);
	         
	       }
		
	}
	
	/**
	 * method counts characters in input  phrase
	 */
void countCharactersInInput()
{
	this.charactersInPhrase = this.inputPhrase.replace(" ", "").length();
}


/**
 * creates string with answer for given input phrase and word
 * @return string in way specified in task
 */
String Answer()
{
	countCharactersInInput();

	String answer = new String();
	double frequency=0;
	DecimalFormat df = new DecimalFormat("#.##");
	for (Entry<String, ArrayList> me : this.wordsAndChars.entrySet()) {
		
		frequency = (1.0*me.getValue().size()/this.charactersFoundCount);
		
		
		
		answer+=("("+me.getValue()+" ,"+me.getKey().length()+")"+ " = "+df.format(frequency) +" (" + me.getValue().size()+ "/" + this.charactersFoundCount + ")" +"\n");
	}
	frequency = 1.0*this.charactersFoundCount/this.charactersInPhrase;
	answer+= ("TOTAL Frequency "+df.format(frequency));
	System.out.println(answer);
	return answer;
	}



}





