package org.example;

import java.util.Scanner;

/**
 *My firts Java Class
 * @author Sergi
 */

/*

Introduction to Java and Object-Oriented Programming
Modulo 1

*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Java");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hola número " + i);
        }

        String java = "Java mola";
        String espacio = "";
        String aprendiendoJava = "y me gusta más que c#";

        String line = java + espacio + aprendiendoJava;

        System.out.println(line);

        System.out.println(11);

        // Cast int to string

        String castToString = Integer.toString(1);

        // Cast double to string

        String castDoubleToString = Double.toString(2.2);

        // Print the values and type values
        System.out.println("================================");
        System.out.println("Print the values and type values");
        System.out.println("================================");

        System.out.println(castToString + " " + castToString.getClass());

        System.out.println(castDoubleToString + " " + castDoubleToString.getClass());

        // Cast string to int

        int stringToInt = Integer.parseInt("22");

        // Cast string to double

        double stringToDouble = Double.parseDouble("22.2");

        // Print the values and type values
        System.out.println("================================");
        System.out.println("Print the values and type values");
        System.out.println("================================");

        System.out.println(stringToInt);
        System.out.println(stringToDouble);

        // Cast to Object then call getclass

        System.out.println("================================");
        System.out.println("Cast to Object then call getclass");
        System.out.println("================================");

        System.out.println(((Object)stringToInt).getClass());
        System.out.println(((Object)stringToDouble).getClass());

        // User input

        System.out.println("================================");
        System.out.println("User input");
        System.out.println("================================");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int myInt = scan.nextInt();
        System.out.println();

        int sumInt = myInt + 1;

        System.out.println(sumInt);

        System.out.println("================================");
        System.out.println("Print the multiplication table");
        System.out.println("================================");

        System.out.println();

        for(int i = 0; i<11; i++)
        {
            int multiplication = myInt * i;
            System.out.println(multiplication);
            System.out.println();
        }

        System.out.println(5 > 4);

        String a = "Hello";
        char b = '!';
        int c = 0;
        System.out.println(a + b + c);




    }
}