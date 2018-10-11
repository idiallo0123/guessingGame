package com.company;

import java.util.Scanner;

public class guessingGame
{
    public static void linearGuessing(int ans)
    {
        //Guess a random number from 1-100 and the program will tell you if you got it right
        System.out.println("Welcome to my linear guessing game, guess a number from 1 to 100");
        //ans = (int) Math.random() * 101;
        System.out.println("Guess my secret number: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        while(ans != guess)
        {
            System.out.println("Guess again: ");
            guess = input.nextInt();
        }
        if(ans == guess)
            { System.out.println("You got it! The number was: "+ans); }
    }

    public static void binaryGuessing(int ans)
    {
        System.out.println("Welcome to my binary guessing game");
        System.out.println("Give a number from 1 to 100");
        Scanner input = new Scanner(System.in);
        ans = input.nextInt();
        //Tell the computer if it's guess is 'too high', 'too low', or if it is 'correct'
        int guess;
        int max = 100;
        int min = 1;
        while(ans != guess)
        {
            int guess = (int) Math.random() * 101;
            System.out.println("Beep boop I guess: "+ guess);
        }

    }
}
