# WarCardGame_CSC122  
## Info
**Author:**
Filip Segota  
**Class:**
CSC 122 (Programming 2), Fall 2020  
**Assignment:**
Lists Lab  

## Overview
Create a program that simulates the playing of the card game War. The program only uses data structures from the Java library (not my own). The list is used for a deck of cards and the queue is used for the hand of cards. The result of each round is put out as an output after every round. The winner of the whole thing is put out as an output as well.

## Rules of War
Game of War is a card game played with a standard 52-card deck. Players get a deck of 26 cards each and in each round, they turn the first one up. Whoever has the bigger card, gets both and puts them at the end of his deck. If it’s a tie, that’s called war. They put the next 3 cards turned down and then play with the fourth one. Whoever wins, gets all the cards from the table. If it’s tied again, the same thing happens. If one player runs out of cards in a tie situation, he plays with the last one he has, and the other player puts the same number of cards as the player who ran out of cards and plays with the next one. The winner is the one who gets all the cards.

## Program Summary
  - Creates the object of the War class, which then:
    - Creates a deck of cards
    - Shuffles it
    - Deals cards to the players
  - Starts the game
    - Takes the top cards from both hands
    - Compares them:
      - If player 1 has the higher card, it adds both of them to the end of player 1 hand
      - If player 2 has the higher card, it adds both of them to the end of player 2 hand
      - If they are the same, it's a war:
        - Takes 3 cards from both players and then it plays with the fourth one. The winner of that round gets all of those cards
        - If it's tied again, it does the same thing again
        - If one player runs out of cards in a tie situation, it plays with the last one that that player has, and it puts the same number of cards from the other player as the player who ran out of cards and plays with the next one
    - Continues until one of the players doesn't have any more cards
  - Outputs the result of each round
  - Outputs the final result
