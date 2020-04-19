package interviewQuestionsAndAnswers;

public class FirstNonRepititiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find the first non repetitive character in the string
        
        //String s ="the fox jumps on the forest";
        
        String s ="aea";
        boolean found=false;
        String searchFor="";
        for (int i=0; i<s.length(); i++)
        {
               found = false;
        	
        	searchFor=s.substring(i, i+1);
               // System.out.println("searching for the character:" + searchFor);
                for(int j=i+1;j<s.length(); j++)
                {
                       String  searchNext = s.substring(j,j+1);
                	if (searchFor.equals(searchNext))
                        { System.out.println("the character :"+  searchFor + " is repetitive");
                        found=true;
                        break;
                        }
                }
               if (!found) 
               {
            	   break;
            	   
            	   //System.out.println("First character that is not repetitive:" +  searchFor);
               
               }
            	   
              // found=false;
        }
       
       if (!found)  System.out.println("First character that is not repetitive:" +  searchFor);

	}

}
