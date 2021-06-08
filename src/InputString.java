import java.util.Scanner;

public class InputString {
//asdas
private String inputPhrase ;
private Scanner scanner = new Scanner(System.in);

InputString(Scanner scanner)
{
	this.scanner = scanner;
}

InputString(String inputPhrase)
{
	this.inputPhrase = inputPhrase;
}


public Object getInputPhrase()
{
	return inputPhrase;
}


public Object setInputPhrase()
{
	return inputPhrase;
}

public void  inputFromUser() {
	
	this.inputPhrase = scanner.next();
	
}




}
