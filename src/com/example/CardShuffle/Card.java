package com.example.CardShuffle;

public class Card {

    private int cardSuit;
    private int cardNum;

    private String hearts = "Hearts";
    private String spades = "Spades";
    private String clubs = "Clubs";
    private String diamonds = "Diamonds";
    private String broken = "broken";

    private String ace = "Ace";
    private String jack = "Jack";
    private String queen = "Queen";
    private String king = "King";


    public Card(int cardSuit, int cardNum)
    {
        this.cardSuit = cardSuit;
        this.cardNum = cardNum;
    }

    public void setCardSuit(int cardSuit)
    {
        this.cardSuit = cardSuit;
    }

    public String getCardSuit()
    {
        if(cardSuit==1)
        {
            return hearts;
        }

        if(cardSuit==2)
        {
            return spades;
        }

        if(cardSuit==3)
        {
            return clubs;
        }

        if(cardSuit==4)
        {
            return diamonds;
        }

        return broken;
    }

    public void setCardNum(int cardNum)
    {
        this.cardNum = cardNum;
    }

    public String getCardNum()
    {
        if(cardNum==1)
        {
            return ace;
        }

        if(cardNum==11)
        {
            return jack;
        }

        if(cardNum==12)
        {
            return queen;
        }

        if(cardNum==13)
        {
            return king;
        }

        return String.valueOf(cardNum);
    }

}
