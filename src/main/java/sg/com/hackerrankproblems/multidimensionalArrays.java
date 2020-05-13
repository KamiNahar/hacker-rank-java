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
public class multidimensionalArrays {
   //multidimensional arrays = are arrays with arrays inside  
    //the first bracket is for row number, second bracket is the element number
    public static void main(String[] args) {
        int [][] arr = { 
            
            {
                1,2,3 //row 0, element 0, 1, 2
            }, 
            
            {
                4,5,6 //row 1, element 0, 1, 2
            },
            
            {
                9,8,9 //row 2, element 0, 1, 2
            }
  
        };
        
       int firstSum = 0;  
       int secondSum = 0;
       int difference = 0;
        

            int leftDiagNumOne = arr[0][0]; 
            int leftDiagNumTwo = arr[1][1]; 
            int leftDiagNumThree = arr[2][2];
            
            int rightDiagNumOne = arr[0][2]; 
            int rightDiagNumTwo = arr[1][1]; 
            int rightDiagNumThree = arr[2][0];
            
            
            
            firstSum = leftDiagNumOne + leftDiagNumTwo + leftDiagNumThree;
            
            secondSum = rightDiagNumOne + rightDiagNumTwo + rightDiagNumThree;
            
            difference = firstSum - secondSum; 
            
            if (difference < 0){
                difference *= -1;
            }

        
        System.out.println(difference);
        
    }
    
}
