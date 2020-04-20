package covid_IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("abc.txt");
		
		fw.write(100);
		//the integer 100 will converted to unicode and written as d
		fw.write("urga\n Software Solutions");
		fw.write("\n");
		
		char[] ch ={'a','b','c','d'};
		
		fw.write(ch);
		
		fw.write("\n");
		fw.write('d');

		fw.flush();
		fw.close();
	}

}
