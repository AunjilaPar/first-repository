/**
Name: ConverProject
Description: allows user to convert to celcius or fahrenheit
Created By: Aunjila Parvin
Created On: 01/04/2018
*/
import java.util.Scanner;

public class ConvertProject{

     public static void main(String [] args){
		 ConvertTemperature();
	}

     private static void ConvertTemperature(){
      Scanner input = new Scanner(System.in);

      System.out.print
     ("\n1. Fahrenheit to Celcius"+"\n2. Celcius to Fahrenheit"+"\nExit"+"\nChoice:");


      int selection = input.nextInt();
      if (selection == 1 ){
         System.out.println ("Enter temperature: ");
         Far2cel();

      }else if (selection == 2 ){
        System.out.println ("Enter temperature: ");

        Cel2far();

      }

    }
    private static void Cel2far(){
	   Scanner input = new Scanner(System.in);

	   double Celcius = input.nextDouble();
	   System.out.println( Celcius+ "Celcius is "+ ((Celcius * 9 / 5.0) +32 )+ "Fahrenheit" );

	   ConvertTemperature();

	}
	private static void Far2cel(){
	   Scanner input = new Scanner(System.in);

	   double Fahrenheit = input.nextDouble();
	   System.out.println( Fahrenheit+ "Fahrenheit is "+ ((Fahrenheit - 32) * (5 / 9.0))+ "Celcius" );

	   ConvertTemperature();

	}


}//end of class