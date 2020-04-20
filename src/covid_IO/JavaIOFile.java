package covid_IO;

import java.io.File;
import java.io.IOException;

public class JavaIOFile {

	public static void main(String[] args) throws IOException {


		File f = new File("abc.txt");
		
		f.createNewFile();
		
		System.out.println("Created New file "+f.exists());

	}

}
