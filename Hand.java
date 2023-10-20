
/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 4: War
/* File:        Hand class
/*****************************************************************************/
import java.util.ArrayDeque;
import java.util.Queue;

public class Hand {
    // field variables
    Queue<Card> hand;

    // constructor
    public Hand() {
        hand = new ArrayDeque<Card>();
    }

    // methods
    public void add(Card c) {
        hand.add(c);
    }

    public Card removeFirst() {
        return hand.remove();
    }

    public int size() {
        return hand.size();
    }

    public boolean isEmpty() {
        if (hand.isEmpty())
            return true;
        return false;
    }

    public String toString() {
        String s;

        s = "";

        for (Card c : hand) {
            s += c.toString() + ", ";
        }

        return s;
    }
}