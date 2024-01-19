// Import the File class
import java.io.File;

// Import the IOException class to handle errors
import java.io.IOException;

public class CreatingAFile {
	public static void main(String[] args)
	{

		try {
			File Obj = new File("myfile.md");
			if (Obj.createNewFile()) {
				System.out.println("File created: "
								+ Obj.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
