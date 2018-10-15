import java.util.Scanner;

public class PigLatin2 {

	
		
	
		    
		    
			    
		    public static void main(String[] args) { 
		    	
		    	String answer;
		    	
		    	System.out.println("Welcome to the Pig Latin Translator");
		    	
		    	do {
		        
		    	
		    	System.out.println("Please enter a word to be translated");
		    	
		    	 Scanner scan = new Scanner(System.in);
		    	String userWord = scan.nextLine();
		    	
		    	//String str = pigLatin(userWord); 
		        
		    	
				//boolean isSpecChar;
				//if ((boolean) (isSpecChar = true)) {
		    	//System.out.println(userWord);}
				
				 if (pigLatin(userWord) == "-1") {
		            System.out.println("that's not a word"); 
		    	}
		    	else if (pigLatin(userWord) == "0") {
		      		System.out.println(userWord + "way");
		        }
		        else  {
		            System.out.println(pigLatin(userWord)); 
		        }
		    System.out.println("Would you like to try again? (y/n)");
		  			answer = scan.next();
		    
		    } while (answer.equalsIgnoreCase("y"));
		    
		    }
		     
		  
			

static boolean isVowel(char c) { 
    return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y' ||
            c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') || c == 'y'; }
    
    
    static String pigLatin(String s) { 
    	  
       
        int len = s.length(); 
        int vowel = -1; 
        for (int i = 0; i < len; i++) 
        { 
            if (isVowel(s.charAt(i))) { 
            vowel = i; 
            break; 
            
           
            }
        } 
         
      
       if (vowel == 0)
    	   return "0";
        if (vowel == -1) 
            return "-1"; 
            		
      
        
        return s.substring(vowel) + 
               s.substring(0,vowel) + "ay"; 
    }
    
   
    private static boolean isSpecChar(String s )
    {
    	return s.toString().matches("[a-z A-Z0-9]");
    }
       

	}
    	


 


	
	