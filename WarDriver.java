
/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 4: War
/* File:        War driver
/*****************************************************************************/
import java.util.Scanner;

public class WarDriver {
    public static void main(String[] args) {
        War game;
        Scanner input;

        input = new Scanner(System.in);
        game = new War();

        System.out.println("Welcome to the game of War!\n" +
                "Press enter to start.");
        input.nextLine();
        game.run();
    }
}