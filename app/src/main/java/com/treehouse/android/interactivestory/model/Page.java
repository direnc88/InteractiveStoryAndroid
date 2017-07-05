package com.treehouse.android.interactivestory.model;

/**
 * Created by charlesdirenzo on 7/2/17.
 */

public class Page
{
    private int imageId;
    private int textId;  //going to use a string resource here
    private Choice choice1;
    private Choice choice2;
    private boolean isFinalpage = false;


    public Page(int imageId, int textId)
    {
        this.imageId = imageId;
        this.textId = textId;
        this.isFinalpage = true;
    }

    public Page(int imageId, int textId, Choice choice1, Choice choice2)
    {
        this.imageId = imageId;
        this.textId = textId;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public boolean isFinalpage()
    {
        return isFinalpage;
    }

    public void setFinalpage(boolean finalpage)
    {
        isFinalpage = finalpage;
    }

    //these getters and setters give us the ability to change how this information is retreived or stored.
    public int getImageId()
    {
        return imageId;
    }


    public void setImageId(int imageId)
    {
        this.imageId = imageId;
    }

    public int getTextId()
    {
        return textId;
    }

    public void setTextId(int textId)
    {
        this.textId = textId;
    }

    public Choice getChoice1()
    {
        return choice1;
    }

    public void setChoice1(Choice choice1)
    {
        this.choice1 = choice1;
    }

    public Choice getChoice2()
    {
        return choice2;
    }

    public void setChoice2(Choice choice2)
    {
        this.choice2 = choice2;
    }
}
