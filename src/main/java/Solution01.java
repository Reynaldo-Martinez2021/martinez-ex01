import java.util.Scanner;

public class Solution01 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 01 Solution
     *  Copyright 2021 Reynaldo Martinez
     */
    /*
     * Ask user to enter name
     * Store the 'name' as string
     * Concatenate 'name' in a string
     * Print the output
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        String outputString = "Hello, " + name + ", nice to meet you!";
        System.out.println(outputString);
    }
}

