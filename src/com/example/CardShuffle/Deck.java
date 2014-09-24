package com.example.CardShuffle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> deckOfCards = new ArrayList<Card>();

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


    public void dealCards()
    {
        Collections.shuffle(deckOfCards);

        for (int player=1; player<5; player++)
        {
            System.out.println();
            System.out.println("Player " + player + "'s Hand:");

            for (int card=0; card<5; card++)
            {
                System.out.println(deckOfCards.get(card).getCardNum() + " of " + deckOfCards.get(card).getCardSuit());
                deckOfCards.remove(card);
            }
        }
    }

}
