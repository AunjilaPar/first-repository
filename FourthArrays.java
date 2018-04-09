/**
Name: FourthArrays
Description: Displays the total of all the numbers
Created By: Aunjila Parvin
Created On: 01/04/2018
*/
public class FourthArrays{

 public static void main (String [] args){

 int[] numbers = {7,6,11,15,19};
 int sum = 0;
 for( int i : numbers) {
     sum += i;
 }

System.out.println("Sum of Array value is: "+sum);

 }


}