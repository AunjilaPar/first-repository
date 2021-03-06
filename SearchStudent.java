/**
Name: SearchStudent
Description: The program should prompt the user to enter a search term and use this search term to find a match or matches in the array
Created By: Aunjila Parvin
Created On: 01/04/2018
*/

import java.util.Scanner;

public class SearchStudent{
  public static void main (String [] args){

    String [] [] students = {
    {"Mary Reilly"," Software Development", "year 1", "GMIT"},
    {"Garrett Winters"," Business Studies", "year 3", "AIT"},
    {"Ashley Cox"," Chemistry", "year 3", "NUIG"},
    {"Joe Kelly"," Computing and Digital Media", "year 2", "GMIT"}

    };

  Scanner input = new Scanner(System.in);
  System.out.print ( "Please enter a search value: ");
  String searchStr = input.nextLine();
  int match= 0;

  System.out.println();
  for(int i =0; i < students.length; i++){
   for (int j = 0; j < students[i].length; j++ ){
    if(searchStr.equals(students[i][j])){
     match++;
     if (match== 1){
       System.out.println("Name\t\tCollege");
     }

     System.out.println(students[i][0]+"\t"+students[i][3]);
    }

   }

  }
   System.out.println();
   System.out.println("Records with match: "+match);
   Index.main(null);

}
}