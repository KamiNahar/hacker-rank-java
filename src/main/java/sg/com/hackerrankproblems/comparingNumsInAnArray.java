/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.com.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaminahar
 */
public class comparingNumsInAnArray {
    
    public static void main(String[] args) {
           // Complete the compareTriplets function below.

List<Integer> a= new ArrayList<>();

a.add(1);
a.add(10);
a.add(3);

List<Integer> b = new ArrayList<>();

b.add(0);
b.add(2);
b.add(1);

int aliceCounter = 0; 
int bobCounter = 0; 

 List<Integer> scores = new ArrayList<>(); 
for(int i = 0; i < a.size(); i++) {
    //get the numbers from the array list so you can compare each 
    int aliceNum = a.get(i);
    int bobNum = b.get(i);
 
    if (aliceNum > bobNum){
aliceCounter++; 
    } if (bobNum > aliceNum){
        bobCounter++;
    } else {

    }
    
}
scores.add(aliceCounter);
scores.add(bobCounter);

        System.out.println(scores);
    } 
    }

