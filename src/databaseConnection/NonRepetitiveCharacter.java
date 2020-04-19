package databaseConnection;

public class NonRepetitiveCharacter {

	public static void main(String[] args) {
		// find the first non repetitive character in the string
        
        String s ="the fox jumps on the forest";
        boolean found=false;
        String searchFor="";
        for (int i=0; i<s.length(); i++)
        {
                searchFor=s.substring(i, i+1);
                System.out.println("searching for the character:" + searchFor);
                for(int j=i+1;j<s.length(); j++)
                {
                        if (searchFor.equals(s.substring(j,j+1)))
                        { System.out.println("the character :"+  searchFor + " is repetitive");
                          found=true; break;
                        }
                }
                if (!found) break;
                found=false;
        }
       
        if (!found)  
        	
        	System.out.println("First character that is not repetitive:" +  searchFor);
	}

}
