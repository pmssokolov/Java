import java.io.*;
import java.util.Scanner;

import by.gsu.pmslab.PalindromeClass;

public class Runner {
    public static void main(String[] args) {
        String str;
        Scanner sc = null;
        Scanner sc1 = null;
        try  {
            sc = new Scanner(new FileReader("src/java.txt"));
            PalindromeClass pr = new PalindromeClass();

            System.out.println(pr.readText(sc));

            sc1 = new Scanner(new FileReader("src/java.txt"));
            System.out.println(pr.getPalindrome(sc1));





        } catch (IOException exc) {
            System.out.println("err");
        }
    }
}

