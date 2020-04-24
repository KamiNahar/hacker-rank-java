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
public class addNumsInArray {
    public static void main(String[] args) {
 
        /*
         * Write your code here.
         */
        
int [] ar = {1,2,3,4,5,6};
        
int sum = 0;

//when its an array you use .length, if it's a list you use .size
 for(int i = 0; i< ar.length; i++){
 int currentNum = ar[i]; 
 sum += currentNum;
 
    }
        System.out.println(sum);
    }  
 }
 
