package com.example.CardShuffle;
import java.util.ArrayList;

public class CardShuffleDemo {

    public static void main(String[] args) {
        ArrayList<Integer> deckOfCards = new ArrayList<Integer>();

        for(int i=1; i<14; i++)
        {
            if(i==1)
            {
                System.out.println("Ace of hearts");
            }

            else if(i==11)
            {
                System.out.println("Jack of hearts");
            }

            else if(i==12)
            {
                System.out.println("Queen of hearts");
            }

            else if(i==13)
            {
                System.out.println("King of hearts");
            }

            else
            {
                System.out.println(i + " of hearts");
            }
        }

    }


}
