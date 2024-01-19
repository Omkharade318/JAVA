// Import the File class
import java.io.File;

// Import this class for handling errors
import java.io.FileNotFoundException; 

// Import the Scanner class to read content from text files
import java.util.Scanner; 

public class ReadingAFile {
	public static void main(String[] args)
	{
		try {
			File Obj = new File("myfile.md");
			Scanner Reader = new Scanner(Obj);
			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}

