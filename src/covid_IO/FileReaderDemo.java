package covid_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		
		//readByCharacterByCharacter();
		
		charArrayRead();
	}
	
	
	public static void readByCharacterByCharacter() throws IOException
	{
		// TODO Auto-generated method stub
				File f = new File("abc.txt");
				
				FileReader fr = new FileReader(f);
				
				int i = fr.read();
				
				//if there is do data throws -1 value
				
				while(i!=-1)
				{
					
					System.out.print((char)i);
					
					i = fr.read();
				}
				
				fr.close();
		
}
	
	public static void charArrayRead() throws IOException 
	{
		File f = new File("abc.txt");
		
		FileReader fr = new FileReader(f);
		
		char[] ch = new char[(int) f.length()];
		
		fr.read(ch);
		
		for(char ch1 :ch)
		{
			
			System.out.print(ch1);
		}
	}

}
