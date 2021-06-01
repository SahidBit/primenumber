import java.util.Scanner;


public class primenumber {


	public static void main(String[] args) {
		// lets get a scanner class
    int userInput;
    int f_count=0;
    int iteration=0;
    Scanner scannObj = new Scanner (System.in);
    System.out.println();
    System.out.println("please gave a number:");
    userInput= scannObj.nextInt();
  
   // System.out.println("You entered :" +  userInput );
   //lets do certain checks on user input
     if(userInput<=1){
     System.out.println("You entered an Invalid number");
       }
       else {
       for (int i=1; i<=userInput; i++){
          
	  if (userInput%i==0){
	      f_count++;
	  }
       
	  iteration++;   
       }
       
       if(f_count==2){
  System.out.println(userInput + " is prime number and factors are -> 1, " + userInput); 
  System.out.println();
  System.out.println("With 1st method number of iteration  is: " +  iteration );
 	    
	  }else {
		  
 	      System.out.print(userInput+" is composite number and factors are -> "); 
 	      
 	   //lets print the factors of the number
	       for (int i=1; i<=userInput; i++){
         
	      if (userInput%i==0){
	          System.out.print(i);
		      System.out.print(",");
	          }
            }
     System.out.println();
     System.out.println("With 1st method number of iteration  is:" +  iteration );
		 
 	     }
          
       }
           
	}

}

    
	
	
	


