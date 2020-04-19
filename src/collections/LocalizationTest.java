package collections;
import java.util.*;

public class LocalizationTest {

	public static void main(String[] args) {
		
		String lang ="en";
		
		String country ="US";
		
		Locale l=new Locale(lang,country);
		
		ResourceBundle r =ResourceBundle.getBundle("/CollectionsJava/resources/language.properties", l);
		
		String str =r.getString("wish");
		
		System.out.println(str);
		

	}

}
