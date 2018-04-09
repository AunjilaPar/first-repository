

/**
Name: Sales
Description: allows user to find sales and quantity sold of a product
Created By: Aunjila Parvin
Created On: 01/04/2018
*/
import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



        double product1 = 2.98;
        double product2 = 4.50;
        double product3 = 9.98;
        double product4 = 4.49;
        double product5 = 6.87;



        System.out.print("Enter a product number: (1-5 or 0 to stop)");
        int product = input.nextInt();


        System.out.print("Enter quantity sold: ");
        int quantity = input.nextInt();



        int sum1 = 0;
        int sum2 = 0;
        while (quantity != 0) {
            sum1 += quantity;

            double total = 0.00;
            //switch case
            switch (product)
            {
                case 1: total += product1 * quantity; break;
                case 2: total += product2 * quantity; break;
                case 3: total += product3 * quantity; break;
                case 4: total += product4 * quantity; break;
                case 5: total += product5 * quantity; break;

                default: System.out.println("Product number must be between 1 and 5 or 0 to stop");
            }
            sum2 += total;


            System.out.print("Enter a product number: (1-5 or 0 to stop)");
            product = input.nextInt();

            System.out.print("Enter quantity sold: ");
            quantity = input.nextInt();
        }



        System.out.println("The total retail value of all products sold is " + sum2);

    }
}