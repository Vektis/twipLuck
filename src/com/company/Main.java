package com.company;
import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {

        // write your code here

         String prompt = "10";
        String check = "0";
        Boolean breaker = false;
        while(!breaker) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is your name?");

            String name = input.next();

            randNum random = new randNum(name);
            int randInt = random.perfectRandom();
            System.out.println("Hello," + name + ",your lucky number is: " + randInt);
            System.out.println("Would you like to go again? (press 0 to exit and 1 for a listing of the name and randomNumber of the object or 2 to enter another name.)");
            prompt = input.next();

            //System.out.println(prompt);

            //System.out.println(prompt.equals(check));
            breaker = prompt.equals(check);

            if (!prompt.equals("2") && !prompt.equals("0") && !prompt.equals("1")){
                while (!prompt.equals("2") && !prompt.equals("0") && !prompt.equals("1")){
                    System.out.println("Invalid input, try again.");
                    prompt = input.next();

                }

            }
            else if(prompt.equals("0")){
                break;
            }
            if (prompt.equals("2")) {
                System.out.println("Enter a new name.");
            }
            if (prompt.equals("1")){
                System.out.println("Name: " + name );
                System.out.println("Number: " + randInt);
                break;
            }



        }


    }
}
