package interviewQuestionsAndAnswers;


public class FrequentOccuringInteger {

	public static void main(String[] args) {
		
		
		      //find the most frequent integer in an array
		         int num[]={2,5,8,2,3,5, 2, 7,6,2,5,8,7,8,7,8,7,7,7};
		        
		         int maxCount=0;
		         int frequentInteger=0;
		        
		         for (int i=0; i< num.length;i++)
		         {
		                 int currentNum= num[i];
		                 int currentCount=0;
		                 // start counting the number of occurrence
		                 for (int j=0;j<num.length;j++)
		                 {
		                         if (currentNum ==  num[j]) 
		                        	 {currentCount ++;}
		                 }
		                
		                 if (currentCount > maxCount)
		                 { 
		                	 maxCount =currentCount;
		                 
		                	 frequentInteger = currentNum;
		                 }
		         }
		        
		         System.out.println(" frequent integer is:" + frequentInteger +" occuring :" + maxCount + " times");
		        }

	

}
