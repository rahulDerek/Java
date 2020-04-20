package covid_IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAppendDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("abc.txt",true);
		
		fw.write(120);
		fw.write("\n");
		fw.write("HelloWorld");
		fw.write("\n");
		fw.flush();
		fw.close();

	}

}
