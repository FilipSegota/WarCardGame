
/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 4: War
/* File:        Deck class
/*****************************************************************************/
import java.util.ArrayList;
import java.util.List;

public class Deck {
    // field variables
    Card c;
    List<Card> deck;

    // constructor
    public Deck() {
        deck = new ArrayList<Card>();
        for (int i = Card.DIAMOND; i <= Card.SPADE; i++) {
            for (int j = 2; j <= 14; j++) {
                c = new Card(j, i);
                deck.add(c);
            }
        }
    }

    // methods
    public void shuffle() {
        Card temp;
        int j, k;

        for (int i = 0; i < 52; i++) {
            j = (int) (Math.random() * 52);
            k = (int) (Math.random() * 52);

            temp = deck.get(j);
            deck.set(j, deck.get(k));
            deck.set(k, temp);
        }
    }

    public Card deal() {
        return deck.remove(0);
    }

    public int size() {
        return deck.size();
    }

    public String toString() {
        String s;

        s = "";

        for (int i = 0; i < deck.size(); i++) {
            s += deck.get(i).toString() + ", ";
            if ((i + 1) % 13 == 0)
                s += "\n";
        }

        return s;
    }
}