 /**
 Name:ContinueTest
 Description: which prompts a user to select a number from 1 to 10, inclusive.
 This number is then used to determine which iteration of a loop should not be completed.
 On each iteration of the loop, print out the value of the counter, except on the iteration which matches the number input by the user. The loop should iterate a maximum of 10 times.
 Created By: Aunjila Parvin
 Created On: 01/04/2018
*/
import java.util.Scanner;

public class ContinueTest{
     public static void main (String [] args){
       for(int count = 1; count <= 10; count++){
       if (count == 5)
       continue;

       System.out.println(count);

       }
     System.out.println("\nUsed continue to skip printing 5");
   }

}
