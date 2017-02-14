/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rezalt
 */
public class LoadTextFile
{


    static ArrayList<String> wordList;
    static String[] stringArray = null;

    public String[] loadText()
    {

        Scanner s;
        try
        {
            s = new Scanner(new File("shakespeare-complete-works.txt"));

            wordList = new ArrayList<>();
            while (s.hasNext())
            {
                String token = s.next().toLowerCase();
               
                
                    // Here we remove punctuation marks
                    if (token.contains("."))
                    {
                        token = token.replace(".", "");
                    }
                    if (token.contains(","))
                    {
                        token = token.replace(",", "");
                    }
                    if (token.contains("'"))
                    {
                        token = token.replace("'", "");
                    }
                    if (token.contains("?"))
                    {
                        token = token.replace("?", "");
                    }
                    if (token.contains(";"))
                    {
                        token = token.replace(";", "");
                    }
                    if (token.contains(":"))
                    {
                        token = token.replace(":", "");
                    }
                    if (token.contains("!"))
                    {
                        token = token.replace("!", "");
                    }
                    if (token.contains("-"))
                    {
                        token = token.replace("-", "");
                    }
                    if (token.contains("["))
                    {
                        token = token.replace("[", "");
                    }
                    if (token.contains("]"))
                    {
                        token = token.replace("]", "");
                    }
                    if (token.contains("("))
                    {
                        token = token.replace("(", "");
                    }
                    if (token.contains(")"))
                    {
                        token = token.replace(")", "");
                    }
                    if (token.contains("~"))
                    {
                        token = token.replace("~", "");
                    }
                    if (token.contains("*"))
                    {
                        token = token.replace("*", "");
                    }
                    if (token.contains("_"))
                    {
                        token = token.replace("_", "");
                    }
                    if (token.contains("..."))
                    {
                        token = token.replace("...", "");
                    }
                    if (token.contains("/"))
                    {
                        token = token.replace("/", "");
                    }
                    wordList.add(token);
                

            }
            
             stringArray = (String[])wordList.toArray(new String[wordList.size()]);
            return stringArray;
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(LoadTextFile.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }




}
