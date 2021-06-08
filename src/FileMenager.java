import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMenager {
/** 
 * class that menages all files
 */
	File file;
	 FileWriter myWriter;
	FileMenager(String fileName) throws IOException
	{
		this.file = new File(fileName);
		this.myWriter = new FileWriter(fileName);
	}
	
	
	/**
	 * creates file with name given in constructor of class if it doesnt already exists
	 * @throws IOException
	 */
	void createFile() throws IOException 
	{
		 if (file.createNewFile()) {
		        System.out.println("File created: " + file.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    }
	
	/**
	 * writes given string to file with name given in constructor of class
	 * @param string
	 */
		 
	void writeToFile(String string)
	{
		try {
		      
		      this.myWriter.write(string);
		     this.myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }	
	}
	
	
	
	
	
	
	

