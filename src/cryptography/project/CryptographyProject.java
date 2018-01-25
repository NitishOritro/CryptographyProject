/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography.project;

import com.letter.cyptography.LetterInNumber;
import static java.lang.Character.isLetter;
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
        LetterInNumber letterInNumberCheck = new LetterInNumber(plaintext.charAt(8));
        System.out.println("Character number conversion is "+letterInNumberCheck.getNumber());
        
        LetterInNumber numberInLetterCheck = new LetterInNumber(26);
        System.out.println("Number conversion is in Character "+numberInLetterCheck.getLetter());
        
        //Random rand = new Random();
        int i,j,k;
        String ciphertext = "";
        for(i=0;i<plaintext.length();i++)
        {
            if(Character.isLetter(plaintext.charAt(i)) && plaintext.charAt(i) != ' ')
            {
                LetterInNumber letterInNumber = new LetterInNumber(plaintext.charAt(i));
                int cipherValue =  (letterInNumber.getNumber() + 3) % 26;       //(p+n) mod 26
                
                LetterInNumber numberInLetter = new LetterInNumber(cipherValue);
                char cipherCharacter = numberInLetter.getLetter();
                ciphertext = ciphertext + cipherCharacter;
            }
        }
        System.out.println("CipherText is" +ciphertext);
        
    }
    
}
