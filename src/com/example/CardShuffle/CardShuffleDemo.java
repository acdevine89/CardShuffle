package com.example.CardShuffle;
import java.util.ArrayList;

public class CardShuffleDemo {

    private String cardSuit;
    private int cardNum;

    public CardShuffleDemo(String cardSuit, int cardNum)
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
