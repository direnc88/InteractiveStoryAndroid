package com.treehouse.android.interactivestory.model;

/**
 * Created by charlesdirenzo on 7/2/17.
 */

public class Choice
{
    private int textId;
    private int nextPage;

    public Choice(int textId, int nextPage)
    {
        this.textId = textId;
        this.nextPage = nextPage;
    }

    public int getTextId()
    {
        return textId;
    }

    public void setTextId(int textId)
    {
        this.textId = textId;
    }

    public int getNextPage()
    {
        return nextPage;
    }

    public void setNextPagt(int nextPagt)
    {
        this.nextPage = nextPagt;
    }
}
