package com.example.CardShuffle;

public class Card {

    private int cardSuit;
    private int cardNum;

    public Card(int cardSuit, int cardNum)
    {
        this.cardSuit = cardSuit;
        this.cardNum = cardNum;
    }

    public void setCardSuit(int cardSuit)
    {
        this.cardSuit = cardSuit;
    }

    public int getCardSuit()
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
