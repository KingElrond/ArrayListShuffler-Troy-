/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistshuffler.troy;

/**
 *
 * @author troyd
 */

import java.util.ArrayList;

public class Shuffler {
    private ArrayList<String> words, shuffled;
    
    public Shuffler(ArrayList<String> w)
    {
        words = w;
        shuffled = new ArrayList<>();
    }
    
    public ArrayList<String> randomize()
    {
        //randomly pick 5 of words and make a sentence without repeat
        int random = 0;
        for(int c = 0; c < 5; c++)
        {
            random = (int) (Math.random() * words.size());
            shuffled.add(words.get(random));
            words.remove(random);
        }
        
        return shuffled;
    }
    
    
    
}
