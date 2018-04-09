/**
Name: Square2
Description: prints out square with hastag
Created By: Aunjila Parvin
Created On: 01/04/2018
*/
import java.util.Scanner;

public class Square2{
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);

	System.out.print("Enter square size:");
	System.out.println();
	System.out.print("Enter fill character:");
	int size = input.nextInt();

	squareOfHashtag(size);


  }//end of main

  public static void squareOfHashtag(int size){
	for (int row =1; row <= size; row++){
	  for(int col = 1; col <= size; col++)
	    System.out.print("#");


	  System.out.println();
   }
  }
}