package interviewQuestionsAndAnswers;




public class VariousOperations {

	
	public static void display(int arr[][]){
		
		for(int i=0; i< arr.length;i++ ){
			
			for (int j=0; j <arr[i].length;j++){
				
				System.out.print( arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arrayOfInts = { 
	            { 32, 87, 3, 589 },
	            { 12, 1076, 12, 8 },
	            { 622, 12, 77, 955 }
	        };
	        int searchfor = 12;
	        
	        System.out.println(arrayOfInts.length);
	        
	        System.out.println(arrayOfInts[0].length);
	        
	        int counter=0;
	       // search:
	        for(int i=0;i < (arrayOfInts.length);i++){
	        	
	        	for (int j=0; j < arrayOfInts[0].length; j++){
	        		
	        		int x =arrayOfInts[i][j];
	        		
	        		if (x == searchfor){
	        			
	        			counter++;
	        			
	        			System.out.println("The position is " +"row"+i+" column"+j);
	        			 
	        			
	        			//break search;
	        			
	        			arrayOfInts[i][j]=0;
	        		}
	        		
	        	}
	        	
	        	
	        }
	        
	        System.out.println("The number of occurence of " +searchfor +"is" +counter);
	        
	        VariousOperations.display(arrayOfInts);
	        
	        
	        //Check the given number is odd or even
	        
	        int z=99;
	        
	       if (( z % 2)== 0){
	    	   
	    	   System.out.println("The given number is even number");
	    	   
	       }
	       
	       else 
	       {
	    	   System.out.println("The given number is odd number");
	       }
	       
	       //Check the given number is odd or even
	       
	       for (int i=0; i < 11;i++){
	    	   
	    	  if((i % 2) == 0){
	    		  
	    		  System.out.println("The given number"+ i+" is even number");
	    	  }
	    	  
	    	  else
	    	  {
	    		  
	    		  System.out.println("The given number"+ i+" is odd number");
	    	  }
	    	  
	    	  
	    	  
	    	  
	       }
	       
	        //Prime number
	       
	       int y=8;
	       boolean prime = true;
	       for (int i =2;i < y;i++){
	    	   
	    	 if (( y % i )== 0){
	    		 prime =false;
	    		// System.out.println("The given number"+y+"is not a prime number");
	    		 break;
	    		 
	    	 }
	    	 
	    	 
	       }
	        if (prime){
	        	
	        	System.out.println("The given number"+y+"is  a prime number");
	        }
	        else
	        {
	        	System.out.println("The given number"+y+"is not a prime number");
	        	
	        }
	       
	       
	}



	}

