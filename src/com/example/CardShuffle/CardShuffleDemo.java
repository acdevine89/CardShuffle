package com.example.CardShuffle;
import java.util.ArrayList;

public class CardShuffleDemo {

    public static void main(String[] args) {

//public void createDeckOfCards()
//    {
        ArrayList<Card> deckOfCards = new ArrayList<Card>();

        for (int suit=1; suit<5; suit++)
        {
            for (int i=1; i<14; i++)
            {
                Card newCard = new Card(suit, i);
                //System.out.println("Suit is " + suit + ", number is " + i);
                deckOfCards.add(newCard);
            }
        }

        for (int i=0; i<53; i++)
        {
            //System.out.println(deckOfCards.get(1).getCardNum());
            System.out.println(deckOfCards.get(1).getCardSuit());
        }
//
//public void printDeckOfCards()
//    {
//
//    }


        //            if(i==1)
//            {
//                newCard.setCardNum("Ace");
//            }
//
//            else if(i==11)
//            {
//                newCard.setCardNum("Jack");
//
//            }
//
//            else if(i==12)
//            {
//                newCard.setCardNum("Queen");
//            }
//
//            else if(i==13)
//            {
//                newCard.setCardNum("King");
//            }

    }
}