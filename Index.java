// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);





    System.out.println("Select an option (1-3):");
    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch");
    System.out.println("3. Methods");
    System.out.println("4. Shadowing");
    System.out.println("5. Overloading");
    System.out.println("6. First Arrays");
    System.out.println("7. Second Array");
    System.out.println("8. Try and Tatch");
    System.out.println("9. Enhanced For");
    System.out.println("10. Search Multi-Dimensional Arrays");
    System.out.println("11. Project Exercise 1");
    System.out.println("12. Project Exercise 2");
    System.out.println("13. Exit");


    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();



	Methods methods = new Methods();





    switch(choice){
      case 1:
        System.out.println("Break lab");
        Methods.main(null);
        Break_Ex2.main(null); //static method call, no instance required.
        break;
      case 2:
        System.out.println("Switch lab");
        System.out.println();
        Methods.main(null);
        FirstSwitch.main(null);
        break;
      case 3:
	    System.out.println("Methods lab");
	    System.out.println();
	    Methods.main(null);
	    Methods.main(null);
        break;
      case 4:
		System.out.println("Shadowing lab");
		System.out.println();
		Methods.main(null);
		Shadowing.main(null);
	  break;
	  case 5:
		System.out.println("Overloading lab");
		System.out.println();
		Methods.main(null);
		Arithmetic.main(null);
	  break;
	  case 6:
		System.out.println("First Arrays lab");
		System.out.println();
		Methods.main(null);
		FirstArrays.main(null);
	  break;
	  case 7:
		System.out.println("Second Arrays lab");
		System.out.println();
		Methods.main(null);
		SecondArrays.main(null);
	  break;
	  case 8:
		System.out.println("Try and Catch lab");
		System.out.println();
		Methods.main(null);
		TryCatch.main(null);
	  break;
	  case 9:
	  		System.out.println("Enhanced For lab");
	  		System.out.println();
	  		Methods.main(null);
	  		EnhancedForLoop.main(null);
	  break;
	  case 10:
	  		System.out.println("Search Multi-Dimensional Arrays lab");
	  		System.out.println();
	  		Methods.main(null);
	  		SearchStudent.main(null);
	  break;
	  case 11:
	  		System.out.println("Project Exercise 1 lab");
	  		System.out.println();
	  		Methods.main(null);
	  		SearchProject.main(null);
	  break;
	  case 12:
	  		System.out.println("Project Exercise 2 lab");
	  		System.out.println();
	  		Methods.main(null);
	  		ConvertProject.main(null);
	  break;
      case 13:
        System.out.println("Exiting....");
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }

    System.out.println();


 }

	public void method1(){
		System.out.println("Methos Lab");
        System.out.println("Method 1 here and i am calling method 2");
        method2();
    }//end method1

    public void method2(){
        System.out.println("Hi method 1, from method 2, I am calling method 3.");
        method3();
        System.out.println("Method 3 says hello to method 1.");
    }//end method2

    public void method3(){

        System.out.println("Hi method 2, from method 3, tell method 1 I say Hello.\n");
    }//end method3



}//end of class