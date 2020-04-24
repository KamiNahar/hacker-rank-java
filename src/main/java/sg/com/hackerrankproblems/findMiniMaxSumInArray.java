/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.com.hackerrankproblems;

/**
 *
 * @author kaminahar
 * 
 * 
 * 
 * Given five positive integers, find the minimum and maximum values that can be calculated by
 * summing exactly four of the five integers. Then print the respective minimum and maximum values
 * as a single line of two space-separated long integers.

For example:
* 
* 
* 
* Sample Input

1 2 3 4 5
Sample Output

10 14
* 
* 
 */
public class findMiniMaxSumInArray {
    
    public static void main(String[] args) {
        
        
        int[] arr = {1,2,3,4,5};
        
    
        
        miniMaxSum(arr);
        
        
        
    }
 
  /*
    - questions to ask: 
    1. is the array sorted or unsorted? 
    2. is the array length always the same in this problem? 
    3. are there any negative numbers? or is it always positive? 
   thoughts on how to approach: 
    -first go through the array.
    -take the smallest 4 numbers and add all to get min
    -take the largest 4 numbers and add all to get max 
    
    - first sort the array. go through the array and compare all the numbers to figure out which numbers are bigger and smaller  
   
    
    
    
    
    */  
        
        static void miniMaxSum(int[] arr) {

         
            
            
//sort the array 
// where it says i = 1 ----remember 1 refers to the index number!!! 
for (int i = 1; i < arr.length; i++) {
    
    
     int constant;  
    //get the last element in the array
    int lastElement = arr[arr.length - 1];
    //get the first element in the array
    int firstElement = arr[0]; 
    int min = lastElement - firstElement;
    int max = lastElement + firstElement;
          
    //the nested for-loop is to compare the current element to the element before it. 
    /* since i is set to 1, j = i is also 1, and as long as 1 is greater than 0 (j > 0), 
    the j-- will subtract 1 from j until it no longer is greater than 0.
    then the program will go through the next index in the outer for-loop which now is i =2.
    and then do the same thing etc until it goes through all the numbers in the array.
    
    so if i = 2, and j = i that is also 2, and j-- will subtract 1 from j until it is no
    longer greater than 0, and then it moves on to the next index number 3 because of the outer for-loop and continues until it goes through the full array. 
    - and remember! when it goes through the index it is comparing the numbers because you are sorting it!!! 
    */
    for (int j = i; j > 0; j--) {
    
        int num = arr[j];
        /* going through each element in the array 
        and comparing the first element to the element before the first element*/
     if (arr[j] < arr[j-1]) {
         //the constant variable holds each element the program is currently going through
         constant = arr[j];
         //
         arr[j] = arr[j-1];
         arr[j-1] = constant; 
     }






//        System.out.println(min + "  " + max);
    }
     
   
}
            
  
              
            
            
            
    }
    
    
    
    
    
    
 //this method will only work if the array is always ordered from smallest to biggest    
//    static void miniMaxSum(int[] arr) {
//    int min = 0; 
//    int max = 0; 
//    
//min = arr[0] + arr[1] + arr[2] + arr[3]; 
//max = arr[4] + arr[3] + arr[2] + arr[1];       
//          System.out.println(min + "  " + max); 
//          
//          
//          
//    }
    

    
    
      
      
      
    
}
