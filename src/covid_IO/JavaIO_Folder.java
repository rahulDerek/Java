package covid_IO;

import java.io.File;

public class JavaIO_Folder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("TestABCD");
		
		System.out.println("The folder TestABCD exists "+f.exists());
		
		if(f.exists() == false)
		{
			
			f.mkdir();
		}
		
		else
		{
			System.out.println("The folder already exists");
		}
	}

}
