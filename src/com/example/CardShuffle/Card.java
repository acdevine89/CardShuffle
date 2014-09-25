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
        switch(cardSuit)
        {
            case 1:
                return hearts;
            case 2:
                return spades;
            case 3:
                return clubs;
            case 4:
                return diamonds;
            default:
                return broken;
        }
    }

    public void setCardNum(int cardNum)
    {
        this.cardNum = cardNum;
    }

    public String getCardNum()
    {
        switch(cardNum)
        {
            case 1:
                return ace;
            case 11:
                return jack;
            case 12:
                return queen;
            case 13:
                return king;
            default:
                return String.valueOf(cardNum);
        }

    }

}
