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
        
        
    int[] arr = {793810624, 895642170, 685903712, 623789054, 468592370};
     
// min=2572095760 
// max=2999145560
    
//Input (stdin)
//793810624 895642170 685903712 623789054 468592370

//Expected Output
//2572095760 2999145560
    
    
   
        
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
        int max = 0;

//sort the array 
// where it says i = 0 ----remember 0 refers to the index number!!! 
//arr.length refers to how many numbers are in the array, so in this example array.length = 5
/* for (int i = 0; i < arr.length - 1; i++) {
    
    //Sort Array first.
    //reassign the currentElement value to an element by using the current index you are on in the for loop.
    currentElement = arr[i];
    //Reassign the nextElement value to the element next to the current element by using the index, 
   // plus 1 is how you get to the next index, thus next element 
    nextElement = arr[i+1];
    
 
    //the index is the location of the element in the array. For example arr[i+1] is the location. 
    //The element for example currentElement is the value. \
    //We are comparing the values and switching the values in the location to sort the numbers in the array. 
    //Notice we are not switching the locations, we never switch the locations, just the values. 
  
//This does not work for all the numbers in the array, because its only comparing each number once instead of comparing to each number in the array.
//This is how it is running through the for loop:
//    69, 221, 7, 8974, 2
//    69, 7, 221, 8974, 2
//    69, 7, 221, 8974, 2
//    69, 7, 221, 2, 8974
    if (currentElement > nextElement) { 
    arr[i+1] = currentElement; 
    arr[i] = nextElement;
   }
  
         */
//so try it in a for loop to see if that works 
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {

                currentElement = arr[i];

                nextElement = arr[i + 1];

                if (currentElement > nextElement) {
                    arr[i + 1] = currentElement;
                    arr[i] = nextElement;
                }
            }
        }


        /*   
//this is just to check if the array is sorted
//this array sorter doesnt work with zeros and negatives, need to fix that! 
for (int k = 0; k < arr.length; k++) {
   System.out.print(arr[k] + " ");  //empty string places a space in between each number
}
         */
//m = 0 is where you start the for loop in your array
//and m < 4 is where you stop the for loop in your array
        for (int m = 0; m < 4; m++) {
            //first iteration of the for loop min = 0 + first element of the array which is arr[i] and arr[i] in the first iteration is really arr[0]
            //In the second iteration i is going to 1 so arr[i] turns into arr[1] and so forth. 
            min = min + arr[m];
        }

        for (int n = 1; n < arr.length; n++) {
            max = max + arr[n];
        }

        System.out.println(min + " " + max);

    }

}
    
    
    

      
      
      
    

