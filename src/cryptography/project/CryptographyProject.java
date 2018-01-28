/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography.project;

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
        String plaintext = "BANGLADESH BEAUTIFUL MY NUMBER 12";
        int lengthOfPlaintext = plaintext.length();
        System.out.println("Length of plaintext is "+lengthOfPlaintext);
        LetterInNumber letterInNumberCheck = new LetterInNumber(plaintext.charAt(8));
        System.out.println("Character number conversion is "+letterInNumberCheck.getNumber());
        
        LetterInNumber numberInLetterCheck = new LetterInNumber(26);
        System.out.println("Number conversion is in Character "+numberInLetterCheck.getLetter());
        
        //Random rand = new Random();
        int i,j,k,row=16,column=0;
        
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
            else if(plaintext.charAt(i) != ' ' || Character.isWhitespace(plaintext.charAt(i)))
            {
                ciphertext = ciphertext + plaintext.charAt(i);
            }
        }
        System.out.println("CipherText is : " +ciphertext);
        
        if(plaintext.length() % 16 == 0)
        {
            column = plaintext.length() / 16;
        }
        else 
        {
            column = plaintext.length() / 16 + 1;
        }
        System.out.println("Column is : " +column);
        
        //Initialize a 2d array
        char ciphertextRotor [][] = new char [row][column];
        int pointer = 0;
        for(i=0;i<column;i++)
        {
            for(j=0;j<row;j++)
            {
                if(pointer != ciphertext.length())
                {
                    ciphertextRotor [j][i] = ciphertext.charAt(pointer);
                    pointer++;
                }
                else 
                {
                    break;
                }
            }
            System.out.println(pointer);
        }
        
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                //ciphertextRotor [row][column] = plaintext.charAt(j);
                 System.out.print(" ("+i+" "+j+")"+ciphertextRotor [i][j]+"   ");
            }
            System.out.println();
        }
    }
    
}
