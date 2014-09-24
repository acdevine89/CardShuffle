package com.example.CardShuffle;

public class Card {

    private int cardSuit;
    private int cardNum;
    private String hearts = "Hearts";
    private String spades = "Spades";
    private String clubs = "Clubs";
    private String diamonds = "Diamonds";


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
        if(cardSuit==1)
        {
            return Integer.parseInt(hearts);
        }

        if(cardSuit==2)
        {
            return Integer.parseInt(spades);
        }

        if(cardSuit==3)
        {
            return Integer.parseInt(clubs);
        }

        if(cardSuit==4)
        {
            return Integer.parseInt(diamonds);
        }

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
