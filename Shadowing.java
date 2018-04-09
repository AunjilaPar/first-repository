/**
Name: Shadowing
Description: using two variables with the same name within scopes that overlap
Created By: Aunjila Parvin
Created On: 01/04/2018
*/

import java.util.Scanner;

public class Shadowing
{
    static int x;
    public static void main(String[] args)
    {
        x = 1;
        System.out.println("Local x = " + x);
        int x;
        x = 2;
        System.out.println("Global x from method = " + x);
        System.out.println("Global x from attrbute: " + x);
    }
}