package java2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		
		String s ="Hello";
		
		Scanner scn = new Scanner(s);
		
		String s1=scn.nextLine();
		
		System.out.println("The value is "+s);
		
		scn.close();
		
		String s2 = scn.nextLine();
		
		
	}

}


class Parent{
	
	
	int s= 5;
	
	
}

class Child extends Parent
{
	
	int u =12;
	
	
}
