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
public class MiniMax {

    public static void main(String[] args) {

        int [] arr = {793810624, 895642170, 685903712, 623789054, 468592370};

        miniMaxSum(arr);

    }

    static void miniMaxSum(int[] arr) {

        int currentElement = 0;
        int nextElement = 0;
        int min = 0;
        int max = 0;

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
for (int k = 0; k < arr.length; k++) {
   System.out.print(arr[k] + " ");  //empty string places a space in between each number
}
         */
        for (int m = 0; m < 4; m++) {
            min = min + arr[m];
        }

        for (int n = 1; n < arr.length; n++) {
            max = max + arr[n];
        }

        System.out.println(min + " " + max);

    }

}
