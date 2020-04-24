/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.com.hackerrankproblems;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 *@author kaminahar
 * 
 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. 
 * Print the decimal value of each fraction on a new line.
 */
public class plusMinus {
    
    public static void main(String[] args) {
        
        //Variables 
        int array [] = {-4, 3, -9, 0, 4, 1  };
        
        /* 
        Need two counters. 
        one is used to count negative numbers in the array, one is for positive numbers in the array, and one for zeroes. 
        */
        int positiveCounter = 0; 
        int negativeCounter = 0;
        int zeroCounter = 0; 
        
        //floats and doubles are not as precise, which is why we use big decimals. It's more accurate. 
        //BigDecimal is an object. 
        BigDecimal bigDecimalPositiveCounter = new BigDecimal(0); 
        BigDecimal bigDecimalNegativeCounter = new BigDecimal(0); 
        BigDecimal bigDecimalZeroCounter = new BigDecimal(0); 
        
        
  
        /* 
        This is a for loop. ex: " for (int i = 0; i < array.length; i++) { 
        "  when the conditions are met inside the parenthesis, keep running the code in the brackets. "
        }; 
        
        The "i" variable is for the index in the array where you are starting from 
        (in this example we are starting at index 0 which is the first element of the array. 
        To check all the numbers in the array from the beginning, set the array index to 0  "i= 0" 
        i < array.length means as long as i is less than the array length keep iterating through the for loop
        i++ means to add one more to the index, which is how it iterates through the numbers until it reaches the last number
        (it knows when to reach the last number because of   i < array.length)
        */
        for (int i = 0; i < array.length; i++) {
            
            /*
            This varibale holds a number from the array using the index. 
            */
            int currentNum = array[i];
            /* 
            If currentNum is greater than 0, add 1 to the positive counter 
            */
            if (currentNum > 0) {
                positiveCounter++;
            } 
            /* 
            If currentNum is less than 0, add 1 to the negative counter 
            */
            if (currentNum < 0) {
                negativeCounter++; 
            }
            //need two equals to compare the values, one equal means assign the value
            if (currentNum == 0) {
                zeroCounter++; 
            }
        }; 
        
        BigDecimal totalNumsInArray = new BigDecimal(array.length);
        /*Convert the number of postives, negatives, and zeroes outside of the for loop.(If it's inside the for loop, it will keep recalculating the answer.)
        First convert the integer counters into BigDecimal counters, then for each divide by the total array length */
        bigDecimalPositiveCounter = new BigDecimal(positiveCounter); 
        bigDecimalNegativeCounter = new BigDecimal(negativeCounter);
        bigDecimalZeroCounter = new BigDecimal(zeroCounter);
        
        //Divide 
        bigDecimalPositiveCounter = bigDecimalPositiveCounter.divide(totalNumsInArray, 6, BigDecimal.ROUND_CEILING);
        bigDecimalNegativeCounter = bigDecimalNegativeCounter.divide(totalNumsInArray, 6, BigDecimal.ROUND_CEILING);
        bigDecimalZeroCounter = bigDecimalZeroCounter.divide(totalNumsInArray, 6, BigDecimal.ROUND_CEILING);

        //Print out the answers. 
        System.out.println(bigDecimalPositiveCounter);
        System.out.println(bigDecimalNegativeCounter);
        System.out.println(bigDecimalZeroCounter);
    }
}

