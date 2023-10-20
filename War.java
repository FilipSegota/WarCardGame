
/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 4: War
/* File:        War class
/*****************************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class War {
    // field variables
    Deck deck;
    Hand p1, p2;
    Scanner input;

    // constructor
    public War() {
        int n;
        deck = new Deck();
        p1 = new Hand();
        p2 = new Hand();

        deck.shuffle();
        n = deck.size();
        // deals cards to each player simultaneously
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                p1.add(deck.deal());
            else
                p2.add(deck.deal());
        }
    }

    // run method
    public void run() {
        Card temp1, temp2;
        List<Card> temp;
        input = new Scanner(System.in);

        // plays until one of the players runs out of cards
        while (!p1.isEmpty() && !p2.isEmpty()) {
            temp1 = p1.removeFirst();
            temp2 = p2.removeFirst();
            System.out.println(temp1.toString() + " vs. " + temp2.toString() +
                    "\n");
            switch (temp1.compareTo(temp2)) {
                // tie
                case 0:
                    System.out.println("It's a war!!!\n");
                    temp = new ArrayList<Card>();
                    temp.add(temp1);
                    temp.add(temp2);
                    tie(temp);
                    break;
                // player 1 has a higher card
                case 1:
                    p1.add(temp1);
                    p1.add(temp2);
                    System.out.println("Player 1 won the round!\n" +
                            "------------------------------");
                    System.out.println("Press enter to continue...");
                    input.nextLine();
                    break;
                // player 2 has a higher card
                case -1:
                    p2.add(temp2);
                    p2.add(temp1);
                    System.out.println("Player 2 won the round!\n" +
                            "------------------------------");
                    System.out.println("Press enter to continue...");
                    input.nextLine();
                    break;
            }
        }

        if (p2.isEmpty()) {
            System.out.println("PLAYER 1 IS A WINNER!!!");
            System.out.println("Press enter to exit...");
            input.nextLine();
        } else if (p1.isEmpty()) {
            System.out.println("PLAYER 2 IS A WINNER!!!");
            System.out.println("Press enter to exit...");
            input.nextLine();
        }
    }

    // tie method
    public void tie(List<Card> l) {
        List<Card> temp;
        Card temp1, temp2;
        int i, size;

        i = 0;
        size = l.size();
        temp = new ArrayList<Card>();
        for (int j = 0; j < size; j++) {
            temp.add(l.remove(0));
        }

        while (!(p1.size() == 1) && !(p2.size() == 1) && i < 3) {
            temp.add(p1.removeFirst());
            temp.add(p2.removeFirst());
            i++;
        }
        temp1 = p1.removeFirst();
        temp2 = p2.removeFirst();
        temp.add(temp1);
        temp.add(temp2);
        System.out.println(temp1.toString() + " vs. " + temp2.toString() +
                "\n");

        switch (temp1.compareTo(temp2)) {
            // tie
            case 0:
                System.out.println("It's a war!!!\n");
                temp.add(temp1);
                temp.add(temp2);
                tie(temp);
                break;
            // player 1 has a higher card
            case 1:
                size = temp.size();
                for (i = 0; i < size; i++) {
                    p1.add(temp.remove(0));
                }
                System.out.println("Player 1 won the round!\n" +
                        "------------------------------");
                System.out.println("Press enter to continue...");
                input.nextLine();
                break;
            // player 2 has a higher card
            case -1:
                size = temp.size();
                for (i = 0; i < size; i++) {
                    p2.add(temp.remove(0));
                }
                System.out.println("Player 2 won the round!\n" +
                        "------------------------------");
                System.out.println("Press enter to continue...");
                input.nextLine();
                break;
        }
    }
}