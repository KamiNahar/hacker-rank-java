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
public class wordWrapController {
    
     public static void main(String[] args) {
        // TODO code application logic here
        
   
        List<String> words = new ArrayList<>();
        
//        words.add("abc");
//        words.add("xyz");
//        words.add("foobar");
//        words.add("cuckoo");
//        words.add("seven");
//        words.add("hello");
       
      
        
        words.add("hhh");
        words.add("d");
        words.add("abc");
        words.add("hhhnhgnhhhnbvncjghh");
        words.add("xyz");
        words.add("foobar");
        words.add("cuckoo");
        words.add("seven");
        words.add("hello");
        
        
        int num = 11; 

        // how many characters you have left in the current line (max 11)
        int charCount = num;
        
        // this variable will keep taking in strings from the "words" arraylist until you cannot anymore
        //it's the next word after the currentwords you want to add. 
        String currentLine;
        
        // after you get currentLine, you will add it to this arraylist
        List<String> allWords = new ArrayList<>();

 
        
        
        
                
        // go through words arraylist
        for(int i = 0; i < words.size(); i++){
            
            // get the word in the current iteration 
            String currentWord = words.get(i);
            
            // get the word's size  3
            int currentWordSize = currentWord.length();
           //if a word is more than the max length (the charCounter in this case is 11)  it will skip the word and continue to the next word.
            if (currentWordSize > num) {
               continue;
            }
            
//            11 - 3 = 8   8 characters left
            charCount = charCount - currentWordSize;
            
            // set the variable you will add to the allWords arraylist equal to the currentWord  currentLine = "abc"
            //set the currentLine to currentWord so that it can start with the original word each time and continue adding words to it
            currentLine = currentWord; //abc
            
            // while the amount of characters you have left is not negative...
            while(charCount < num && charCount > 0){
                
                // get the next word  xyz
                String nextWord = words.get(i + 1);
            
                // get the next word's size  3
                int nextWordSize = nextWord.length();
            
                // 8 - 3 = 5
                charCount = charCount - nextWordSize;
                
                // if the amount of characters is less than or equal to 0, break out of the while, do not continue
                // else you can add that next word to the currentLine variable, including a space between the words currentLine = "abc xyz"
                if(charCount <= 0){
                    // leave the while loop
                    break;
                }else{
                    currentLine = currentLine + " " + nextWord;
                    
                    //this is to subtract each space between the words
                    charCount -= 1;
                    
                    // start from the next word. Right now in this iteration we are at index 0 of the "words" arraylist. 
                    // The word at index 0 is "abc"
                    // Now that we added the second word "xyz" to "abc", when we go back to the for loop, we will 
                    // want to skip the "xyz" iteration that happens at index 1. We want to stop "xyz" from being assigned to currentWord on line 51
                    
                    i = i + 1;      // i = 1   This is the word "xyz" in the "words" arraylist
                    
                    
                    // "words" size = 6   There are 6 words in that arraylist
                    // 0,1,2,3,4,5   are all the indexes (i) of the "words" arraylist.  If i = 6, you will go out of bounds
                    // anything after i = 5 does not exist
                    // so words.get(i)  when i is a number greater than 5 will always fail
                    // so when i = 5, we should break out of the while loop so we don't get an error when we go back to line 66, where 
                    // we are trying to get the next word by increasing i by 1
                    if(i == words.size() - 1){
                        break;
                    }
                }

                
            }
   
            
            allWords.add(currentLine);
                    
            // reset counter after end of line
          charCount = num;
          

        }
        


        for(String s : allWords){
            System.out.println(s);
        }
        
        
        
    }
    
}
