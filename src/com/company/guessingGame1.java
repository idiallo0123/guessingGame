package com.company;

import java.util.Scanner;

public class guessingGame1
{
    public static void guessingGame1(int ans)
    {
        //Guess a random number from 1-100 and the program will tell you if you got it right
        Scanner guess = new Scanner(System.in);
        guess = guess.nextInt();
        System.out.println("Guess my secret number: ");
        while(ans != guess)
        {
            System.out.println("Guess again: ");
            guess = input.nextLine();
        }
        System.out.println("You got it! The number was: "+ans);
    }
}
