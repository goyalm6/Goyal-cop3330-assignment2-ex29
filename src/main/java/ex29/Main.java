/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 29
 *  Copyright 2021 Mayank Goyal
 */

package ex29;

import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        if(getYears().isValid)
        {
            System.out.println("It will take " + getYears().year + " to double your initial investment.");
        }
        else
        {
            System.out.println("Sorry. That's not a valid input");
        }
    }

    static Model getYears() {
        Scanner scanner =new Scanner(System.in);
        Model m = new Model();
        while(true) {
            try {
                System.out.print("What is the rate of return? ");
                int r = Integer.parseInt(scanner.next());

                int years = (72 / r);
                m.isValid = true;
                m.year = years;
                return m;
            } catch (ArithmeticException e) {
                System.out.println("Sorry. That's not a valid input");
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input");
            }
        }
    }

     static class Model {
        boolean isValid;
        int year;
    }
}
