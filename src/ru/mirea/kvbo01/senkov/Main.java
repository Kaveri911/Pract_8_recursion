package ru.mirea.kvbo01.senkov;
import java.util.*;
import java.lang.String;

public class Main {
  public static String inv_word="";
    static void invert(int x)
    {
        int y = x % 10;
        x = x / 10;
        System.out.print(y);
        if (x != 0)
        {
            invert(x);
        }
        else
        {
            System.out.println("\n");
        }
    }

    static void strInv(String s)
    {
        inv_word += s.charAt(0);
        s = s.substring(1, s.length());
        if (s.length() != 0)
        {
            strInv(s);
        }

    }
    static void isPallindrom(String s)
    {
        strInv(s);
        System.out.println(s+" is pallindrom?" + " -- "+ inv_word.equals(s));
    }

    public static void main(String[] args)
    {

   invert(1234);
   isPallindrom("ABBA");

    }
}
