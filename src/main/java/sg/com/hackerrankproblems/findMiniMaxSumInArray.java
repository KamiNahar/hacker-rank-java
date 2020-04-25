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
        
        
        int[] arr = {2,1,5,3,4};
        
    
        
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

      //To sort through the array, you need to compare each element to one another and then move the smaller element up in the index. 
      int currentElement = 0; 
      int nextElement = 0; 
      //variables to store you min and max
      int min = 0;
      int max= 0;
            
//sort the array 
// where it says i = 0 ----remember 0 refers to the index number!!! 
//arr.length refers to how many numbers are in the array, so in this example array.length = 5
for (int i = 0; i < arr.length - 1; i++) {
    
    //Sort Array first.
    //reassign the currentElement value to an element by using the current index you are on in the for loop.
    currentElement = arr[i];
    /*Reassign the nextElement value to the element next to the current element by using the index, 
    plus 1 is how you get to the next index, thus next element */
    nextElement = arr[i+1];
    
    /*
    the index is the location of the element in the array. For example arr[i+1] is the location. 
    The element for example currentElement is the value. \
    We are comparing the values and switching the values in the location to sort the numbers in the array. 
    Notice we are not switching the locations, we never switch the locations, just the values. 
    */
    if (currentElement > nextElement) {
    arr[i+1] = currentElement; 
    arr[i] = nextElement;
    }
    
     }
//this is just to check if the array is sorted
//this array sorter doesnt work with zeros and negatives, need to fix that! 
//for (int i = 0; i < arr.length; i++) {
//   System.out.print(arr[i]);  
//}
 
//i = 0 is where you start the for loop in your array
//and i < 3 is where you stop the for loop in your array
for (int i = 0; i < 4; i++) {
 //first iteration of the for loop min = 0 + first element of the array which is arr[i] and arr[i] in the first iteration is really arr[0]
 //In the second iteration i is going to 1 so arr[i] turns into arr[1] and so forth. 
    min = min + arr[i];
}

for (int i = 1; i < arr.length; i++) {
    max = max + arr[i];
}
  
System.out.println(min + "  " + max); 
            
            
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
    


  /*

     int constant;  
    //get the last element in the array
    int lastElement = arr[arr.length - 1];
    //get the first element in the array
    int firstElement = arr[0]; 
    int min = lastElement - firstElement;
    int max = lastElement + firstElement;

*/
    //the nested for-loop is to compare the current element to the element before it. 
    /* since i is set to 1, j = i is also 1, and as long as 1 is greater than 0 (j > 0), 
    the j-- will subtract 1 from j until it no longer is greater than 0.
    then the program will go through the next index in the outer for-loop which now is i =2.
    and then do the same thing etc until it goes through all the numbers in the array.
    
    so if i = 2, and j = i that is also 2, and j-- will subtract 1 from j until it is no
    longer greater than 0, and then it moves on to the next index number 3 because of the outer for-loop and continues until it goes through the full array. 
    - and remember! when it goes through the index it is comparing the numbers because you are sorting it!!! 
  
    for (int j = i; j > 0; j--) {
    
        int num = arr[j];
        /* going through each element in the array 
        and comparing the first element to the element before the first element
     if (arr[j] < arr[j-1]) {
         //the constant variable holds each element the program is currently going through
         constant = arr[j];
         //
         arr[j] = arr[j-1];
         arr[j-1] = constant; 
     }
*/  
    
      
      
      
    

