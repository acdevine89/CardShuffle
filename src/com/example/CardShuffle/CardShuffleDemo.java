package com.example.CardShuffle;

public class CardShuffleDemo {

    public static void main(String[] args) {

        Deck aDeck = new Deck();
        aDeck.createDeck();
        aDeck.dealCards();
        aDeck.programRepeat();

    }
}

//PRINT ENTIRE DECK:
//    for (int i = 0; i < 52; i++)
//    {
//    System.out.println(deckOfCards.get(i).getCardNum() + " of " + deckOfCards.get(i).getCardSuit());
//    }