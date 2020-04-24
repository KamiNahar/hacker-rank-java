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
Problem: 

Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]



*/

public class reverseArray {
    
    public static void main(String[] args) {
   
    //make an array with the length of 3   
    int [] nums = {1, 2, 3}; 
    //create another area to put the reverse order of numbers in here
//passes in the length of the first array it is going to reverse the elements from    
    int [] reverseArrayList = new int[nums.length]; 

/*for every element (i) its going to start at zero index, as long the index is less
than the length of the array, add one more to i */
for (int i = 0; i < reverseArrayList.length; i ++) {
    
    
 //goes through  nums array, takes the length subtracts i and then subtracts 1 to go to the previous index?)
  reverseArrayList[i] = nums[nums.length - i -1]; 
}

        System.out.println(reverseArrayList);
    
        
    }
  
    
    
    
}



//public int[] reverse3(int[] nums) {
//  
//int [] reverseArrayList = new int[nums.length]; 
// 
//for (int i = 0; i < reverseArrayList.length; i ++) {
//  reverseArrayList[i] = nums[nums.length - i -1]; 
//}
// return reverseArrayList; 
//  
//}



//public int[] reverse3(int[] nums) {
//  
//for (int i=0; i <nums.length/2; i++) {
//  int temporaryNumber = nums[i]; 
//  nums[i] = nums[nums.length - i -1];
//  temporaryNumber = nums[nums.length - i - 1];
//}
// return nums;
//  
//}