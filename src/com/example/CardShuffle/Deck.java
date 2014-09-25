package com.example.CardShuffle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> deckOfCards = new ArrayList<Card>();
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

    public void dealCards()
    {
        Collections.shuffle(deckOfCards);

        for (player=0; player<4; player++)
        {
            System.out.println();
            System.out.println("Player " + player + "'s Hand:");
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
