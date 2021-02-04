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

public class ArrayListShufflerTroy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList<String> words = new ArrayList<String>();
        words.add("Tokay");
        words.add("School");
        words.add("High");
        words.add("Cool");
        words.add("Laptop");
        words.add("is");
        words.add("the");
        words.add("and");
        
        Shuffler s = new Shuffler(words);
        
        
        ArrayList<String> ranWords = new ArrayList<>();
        ranWords = s.randomize();
        
        System.out.println(ranWords);
        
    }
    
}
