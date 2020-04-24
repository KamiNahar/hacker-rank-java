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
public class addingLongsInArrays {
    public static void main(String[] args) {
        long [] ar = {1000002, 1000022, 1000001, 1000001};
        long sum = 0; 
        
        for (int i = 0; i <ar.length; i++) {
           long currentNum = ar[i];
           sum = sum + currentNum;
        }
        
        System.out.println(sum);
    }
    
   
}
