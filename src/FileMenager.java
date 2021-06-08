import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMenager {

	private String fileName;
	 File file;
	 FileWriter myWriter;
	FileMenager(String fileName) throws IOException
	{
		this.fileName = fileName;
		this.file = new File(fileName);
		this.myWriter = new FileWriter(fileName);
	}
	
	void createFile() throws IOException 
	{
		 if (file.createNewFile()) {
		        System.out.println("File created: " + file.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    }
		 
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
	
	
	
	
	
	
	

