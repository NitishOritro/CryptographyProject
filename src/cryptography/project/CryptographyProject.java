/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography.project;

import com.letter.cyptography.LetterInNumber;
import java.util.Random;

/**
 *
 * @author Nitish Ranjan Bhownmik
 */
public class CryptographyProject 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String plaintext = "BANGLADESH BEAUTIFUL MY NUMBER 12";
        int lengthOfPlaintext = plaintext.length();
        System.out.println("Length of plaintext is "+lengthOfPlaintext);
        LetterInNumber letterInNumber = new LetterInNumber(plaintext.charAt(8));
        System.out.println("Character number conversion is "+letterInNumber.getNumber());
        
        LetterInNumber NumberInLetter = new LetterInNumber(16);
        System.out.println("Number conversion is in Character "+NumberInLetter.getLetter());
        
        Random rand = new Random();
        
        
        
    }
    
}
