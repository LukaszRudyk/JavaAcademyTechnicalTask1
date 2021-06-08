import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;



public class FindCharacters {
private String inputPhrase;
private String[] charactersToFind;
int charactersFoundCount = 1;
int charactersInPhrase = 0;
public  HashMap<String,ArrayList> wordsAndChars ;

	public FindCharacters(String inputPhrase,String[] charactersToFind)
	{
		this.inputPhrase = inputPhrase;
		this.charactersToFind=charactersToFind;
		this.wordsAndChars = new HashMap<String,ArrayList>();
		
	}
	
	void seperateWords()
	{
		
		String[] temporary = this.inputPhrase.split(" ");
		for(String string : temporary)
		{
			
			//System.out.println(string.toLowerCase());
			this.wordsAndChars.put(string.toLowerCase(),null);
		}
	}
	
void removeSpecialCharacters()
{
	this.inputPhrase =this.inputPhrase.replaceAll("[^a-zA-Z0-9]", " ");  
}
	
	void findCharactersInWords()
	{
		
		for (Entry<String, ArrayList> me : this.wordsAndChars.entrySet()) {
			ArrayList charactersFound = new ArrayList<String>();
	         for(String character : this.charactersToFind)
	         {
	        	if(me.getKey().contains(character))
	        	{
	        		charactersFound.add(character);
	        		this.charactersFoundCount += 1;
	        	
	        	}
	        }
	         
	         this.wordsAndChars.put(me.getKey(),charactersFound);
	         
	       }
	}
void countCharactersInInput()
{
	this.charactersInPhrase = this.inputPhrase.replace(" ", "").length();
}




String Answer()
{
	countCharactersInInput();

	String answer = new String();
	double frequency=0;
	DecimalFormat df = new DecimalFormat("#.##");
	for (Entry<String, ArrayList> me : this.wordsAndChars.entrySet()) {
		
		frequency = (1.0*me.getValue().size()/this.charactersFoundCount);
		//System.out.println(me.getKey().length()+" "+this.charactersFoundCount+" "+d);
		
		
		answer+=("("+me.getValue()+" ,"+me.getKey().length()+")"+ " = "+df.format(frequency) +" (" + me.getValue().size()+ "/" + this.charactersFoundCount + ")" +"\n");
	}
	frequency = 1.0*this.charactersFoundCount/this.charactersInPhrase;
	answer+= ("TOTAL Frequency "+df.format(frequency));
	System.out.println(answer);
	return answer;
	}



}





