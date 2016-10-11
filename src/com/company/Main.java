package com.company;
import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {

        // write your code here

         String prompt = "10";
        while(prompt != "0") {
            Scanner input = new Scanner(System.in);
            System.out.println("What is your name?");

            String name = input.next();

            randNum random = new randNum(name);
            System.out.println("Hello," + name + ",your lucky number is: " + random.perfectRandom());
            System.out.println("Would you like to go again? (press 0 to exit and 1 for a listing of the name and randomNumber of the object or 2 to enter another name.)");
            prompt = input.next();
            if (prompt == "1"){
                System.out.println("Name: " + name );
            }

        }


    }
}
