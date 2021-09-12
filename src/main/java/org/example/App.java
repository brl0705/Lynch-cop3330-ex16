package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input1.nextInt();

        if(age >= 16){
            System.out.println("You are old enough to drive!");
        }
        else{
            System.out.println("You are too young to drive :(");
        }

    }
}
