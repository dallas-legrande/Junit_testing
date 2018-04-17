package lab7;

/**
 * Author: Dallas LeGrande
 * Date; April 13, 2018
 * Overview: Lab 7 in CSCI232. Practice on the greedy algorithm that makes change in US cents.
 * Practice on creating Junit tests to run program
 */
public class Lab7 {
    
    public static int[] makeChange(int[] a, int b)
    {
        
        if(a.length == 0) { //if the array is empty throw an exception
            throw new IllegalArgumentException("Array of size 0 is not allowed");
		}
        if(b < 0)
        {
            throw new IllegalArgumentException("Change requested must be greater than 0");
        }
        int[] change = new int[99]; //initializes an array to hold the amount and denomination of coins needed to make the change
        int j = 0;
        //a[0] = 1, a[1] = 5, a[2] = 10, a[3] = 25
        while(b != 0) //while there is still change left to give
        {
            
            for(int i = a.length-1; i >= 0; i--){
                if(a[i] <= b) //if the coin is smaller to or equal to the change still needed
                {
                    change[j] = a[i]; //put the change into the array holding the change
                    b = (b - change[j]); //deduct the amount of the coin from the change still needed to be given
                    j++; //increment the count in the change array to the next spot
                } //end of if
            }//end of for loop
        }//end of while loop
        int[] correctChange = new int[j]; //new array to hold only the amount of coins needed
        for(int k = 0; k < j; k++){ //makes an array that is the size of the correct coins
            
            correctChange[k] = change[k];
        }    
        
        return correctChange; 
    }
    
}
