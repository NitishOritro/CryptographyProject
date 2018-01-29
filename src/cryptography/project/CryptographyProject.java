/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography.project;

import com.ciphertext.generate.PlaintextToCiphertext;
import com.letter.cyptography.LetterInNumber;
import static java.lang.Character.isLetter;
import static java.lang.Character.isWhitespace;
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
        String plaintext = "BANGLADESH BEAUTIFUL MY NUMBER 12#@&";
        int lengthOfPlaintext = plaintext.length();
        System.out.println("Length of plaintext is "+lengthOfPlaintext);
        LetterInNumber letterInNumberCheck = new LetterInNumber(plaintext.charAt(26));
        System.out.println("Character number conversion is "+letterInNumberCheck.getNumber());
        
        LetterInNumber numberInLetterCheck = new LetterInNumber(26);
        System.out.println("Number conversion is in Character "+numberInLetterCheck.getLetter());
        
        //Random rand = new Random();
        String ciphertext = "";
        String ciphertextGenerate = "";
        PlaintextToCiphertext plaintextToCiphertext = new PlaintextToCiphertext();
        ciphertext = plaintextToCiphertext.generateCipherText(plaintext);
        int i,j,k,row=16,column=0;
        
        System.out.println("CipherText is : " +ciphertext);
        
        //Divide a row column accorfing to detect cipherRotor machine
        
        if(plaintext.length() % 16 == 0) 
        {
            column = plaintext.length() / 16;
        }
        else 
        {
            column = plaintext.length() / 16 + 1;
        }
        System.out.println("Column is : " +column);
        
        //Call 2d rotor machine array
        ciphertextGenerate = plaintextToCiphertext.generateCipherTextToRotorCiphertext(ciphertext, row, column);
        
        System.out.println("Generate CipherText is : " +ciphertextGenerate);
    }
    
}
