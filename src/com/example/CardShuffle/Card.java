package com.example.CardShuffle;

/**
 * Created by anniedevine on 9/23/14.
 */
public class Card {

    private String cardSuit;
    private int cardNum;

    public Card(String cardSuit, int cardNum)
    {
        this.cardSuit = cardSuit;
        this.cardNum = cardNum;
    }

    public void setCardSuit(String cardSuit)
    {
        this.cardSuit = cardSuit;
    }

    public String getCardSuit()
    {
        return cardSuit;
    }

    public void setCardNum(int cardNum)
    {
        this.cardNum = cardNum;
    }

    public int getCardNum()
    {
        return cardNum;
    }

}