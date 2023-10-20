/*****************************************************************************
 * /* Author: Filip Segota
 * /* Class: CSC 122, Fall 2020
 * /* Assignment: Lab 4: War
 * /* File: Card class
 *****************************************************************************/
public class Card implements Comparable<Card> {
    // class constants
    static final int DIAMOND = 1;
    static final int CLUB = 2;
    static final int HEART = 3;
    static final int SPADE = 4;
    // constant variables
    final int value;
    final int suit;

    // constructor
    public Card(int n, int s) {
        value = n;
        suit = s;
    }

    // accessors
    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    // methods
    public boolean equals(Card c) {
        if (c.getValue() == value)
            return true;
        return false;
    }

    public int compareTo(Card c) {
        if (value == c.getValue())
            return 0;
        else if (value > c.getValue())
            return 1;
        else
            return -1;
    }

    public String toString() {
        String s;

        s = "";

        switch (suit) {
            case 1:
                s = "" + value + " of diamonds";
                break;
            case 2:
                s = "" + value + " of clubs";
                break;
            case 3:
                s = "" + value + " of hearts";
                break;
            case 4:
                s = "" + value + " of spades";
                break;
        }

        return s;
    }
}