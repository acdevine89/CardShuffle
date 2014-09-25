package com.example.CardShuffle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Deck {

    List<Card> deckOfCards = new ArrayList<Card>();
    Scanner user = new Scanner(System.in);
    int player, card;

    public void createDeck()
    {
        for (int suit = 1; suit < 5; suit++)
        {
            for (int i = 1; i < 14; i++)
            {
                Card newCard = new Card(suit, i);
                deckOfCards.add(newCard);
            }
        }
    }

    public void doSomething()
    {
        int userChoice;
        boolean quit = false;

        do
        {
            System.out.println("Let's deal some cards...");
            System.out.print("Deal again? Type 1 for yes, or 2 for no: ");
            checkIfInt(user);
            userChoice = user.nextInt();
            user.nextLine();

            switch (userChoice)
            {
                case 1:
                    aDeck.dealCards();
                    break;
                case 2:
                    quit = true;
                    break;
                default:
                    System.out.println();
                    System.out.print("Invalid choice. Please type 1 to deal again, or 2 to exit the program: ");
                    System.out.println();
            }
        }while(!quit);
    }

    public void dealCards()
    {
        Collections.shuffle(deckOfCards);

        for (player=0; player<4; player++)
        {
            System.out.println();
            System.out.println("Player " + (player+1) + "'s Hand:");
            createHands();
        }
    }

    public void createHands()
    {
        for (card=0; card<5; card++)
        {
            Card thisCard = deckOfCards.get(card+(5*player));
            System.out.println(thisCard.getCardNum() + " of " + thisCard.getCardSuit());
            //deckOfCards.remove(card);
        }
    }

}
