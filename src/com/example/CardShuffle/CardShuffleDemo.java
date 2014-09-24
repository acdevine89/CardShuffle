package com.example.CardShuffle;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CardShuffleDemo {

    public static void main(String[] args) {

            List<Card> deckOfCards = new ArrayList<Card>();

            for (int suit = 1; suit < 5; suit++) {
                for (int i = 1; i < 14; i++) {
                    Card newCard = new Card(suit, i);
                    deckOfCards.add(newCard);
                }
            }

//            for (int i = 0; i < 52; i++) {
//                System.out.println(deckOfCards.get(i).getCardNum() + " of " + deckOfCards.get(i).getCardSuit());
//            }

    Collections.shuffle(deckOfCards);

    for (int player=1; player<5; player++)
    {
        System.out.println("Player " + player + "'s hand:");

        for (int card=0; card<5; card++)
        {
            System.out.println(deckOfCards.get(card).getCardNum() + " of " + deckOfCards.get(card).getCardSuit());
        }

    }


    }

}