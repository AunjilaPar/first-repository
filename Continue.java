/**
Name:ontinue
Description: which prompts a user to select a number from 1 to 10, inclusive.
This number is then used to determine which iteration of a loop should not be completed.
On each iteration of the loop, print out the value of the counter, except on the iteration which matches the number input by the user. The loop should iterate a maximum of 10 times.
Created By: Aunjila Parvin
Created On: 01/04/2018
*/


import java.util.Scanner;

public class Continue{
     public static void main (String [] args){
	 Scanner scan = new Scanner(System.in);

       int num=0;

       System.out.println("Enter a number from 1-10: "+ num);

       num= scan.nextInt();

       for(int count = 1; count <= 10; count++){
       if (count == 5)
       continue;

       System.out.println(count);

       }

   }

}