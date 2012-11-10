/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree_content;

import java.io.Serializable;

/**
 *
 * @author TheRusskiy
 */
public class Data implements Serializable{
    //Data fields:
    private String text;
    //TODO spent time field
    
    /**
     * Constructor that takes String
     */
    public Data(String text)
    {
        this.text=text;
    }
    
    
    /**
     * Set text field
     */
    public String getText()
    {
        return text;
    }
    
    
    /**
     * Set text field
     */
    public void setText(String text)
    {
        this.text=text;
    }
    
    
    /**
     * Checks if data is equal
     */
    public boolean equals(Data data)
    {
        return this.getText().equals(data.getText());
    }
}
