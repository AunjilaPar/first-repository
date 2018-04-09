
/**
Name: Arithmetics
Description: perfoms maths with methods
Created By: Aunjila Parvin
Created On: 01/04/2018
*/
import java.util.Scanner;


public class Arithmetic{
Scanner input = new Scanner(System.in);
  public void addNumber(int a1, int b1)
   {
	  int a11 = a1;
	  int b11 = b1;
	  int c11= a11 + b11;

	  System.out.println("2 + 3= "+c11 );
    }

	public void addNumber(int a13, int b24 , int c36)
	{
	  int a12 = a13;
	  int b22 = b24;
	  int c33 = c36;
	  int d44 = a12 + b22  + c33;

	  System.out.println("2 + 3 + 5 = "+d44 );
     }

     public static void main (String [] args){

		 Arithmetic mArithmetic = new Arithmetic();
		 mArithmetic.addNumber(2, 3);
		 mArithmetic.addNumber(2, 3 , 5);

	  }


	}//end of class
