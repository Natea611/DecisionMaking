package com.example;
import java.util.Scanner;

public class MyClass {

    public static void main (String args[])
    {
        //Allows the use of user input
        Scanner in = new Scanner(System.in);

        //declares self destruct codes
        String destructCodes[] = {"alpha", "delta", "niner", "foxtrot"};

        //Declares the codes that will be inputted for self destruct sequence
        String codes[] = {"unknown", "unknown", "unknown", "unknown"};


        //Bool that starts the self destruct sequence
        boolean trigger = false;

        for (int j = 0; j < codes.length; j++) {

            System.out.println("Enter what you wish to do: ");
            codes[j] = in.nextLine();
        }


        int total = 0;

        for (int i = 0; i < destructCodes.length; i++)
        {

            if (codes[i].equals(destructCodes[i]))
            {
                total = total + 1;
            }

            if (total == 4)
            {
                trigger = true;
            }

        }




        if (trigger == true)
        {
            System.out.println("Self-Destruct sequence activated, t-minus 30 seconds.");
            System.out.println("30...29...28...27.........");

            System.out.println("Boom!");
        }
    }

}
