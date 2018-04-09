/**
Name: Enhanced for Loop
Description: displays the total of numbers on array similar to for loop
Created By: Aunjila Parvin
Created On: 01/04/2018
*/
public class EnhancedForLoop{

 public static void main (String [] args){
int [] numbers = { 7,6,11,15,19 };
int sum = 0;
for(int i = 0; i < numbers.length; i++){
    sum += numbers[i];
}
System.out.println("Sum Of array value is: " + sum);
}
}