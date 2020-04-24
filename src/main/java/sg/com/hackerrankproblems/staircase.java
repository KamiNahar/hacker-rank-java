/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.com.hackerrankproblems;

/**
 *
 * @author kaminahar
 */

/*
Staircase Problem: 

Print a staircase of size  using # symbols and spaces.

Note: The last line must have  spaces in it.

Sample Input
6 

Sample Output

     #
    ##
   ###
  ####
 #####
######

Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .

*/




public class staircase {
    
    public static void main(String[] args) {
        
       int n = 100; 
       
       //i++ increase the iterations one by one until it reaches the n value which in this case is 6. 
       //This is a nested for-loop. the first for-loop will iterate 6 times and within that
       //for-loop there is another for-loop that will iterate the number of times in the "amountOfSpaces" variable. 
      
        for (int i = 1; i <= n; i++) {
            
            int amountOfSpaces = n - i;
            int numberOfTags =  n - amountOfSpaces; //is n = 6, and i is 1, amount of spaces is 5 and number of tags is 1 ( cause you do 6-5 = 1). 
                //System.out.println(""); ln prints to the next line. if you want it to print on the same  line take out "ln" and use just print. 
        
       for (int j = 1; j <= amountOfSpaces; j++) {
             System.out.print(" "); 
         }        
                
                
                
        for ( int k = 1; k <= numberOfTags; k++) {
         
            System.out.print("#");
         }   
        
        //sout placed here so that, after one line of hastags and spaces are printed, it will go to next line to print the next set of hastag and spaces.  
            System.out.println("");
            
  
        }
        
        
        
        
    }
 
    
    
    
    
}
