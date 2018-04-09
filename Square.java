/**
Name: Square
Description: allows the user to create square using Asterisks
Created By: Aunjila Parvin
Created On: 01/04/2018
*/


import java.util.Scanner;

public class Square{
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);

	System.out.print("Enter square size:");
	int size = input.nextInt();

	squareOfAsterisks(size);


  }//end of main

  public static void squareOfAsterisks(int size){
	for (int row =1; row <= size; row++){
	  for(int col = 1; col <= size; col++)
	    System.out.print("*");


	  System.out.println();
   }
  }
}