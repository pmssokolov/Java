package by.gsu.pmslab;


import java.util.Scanner;

public class PalindromeClass {
    private String substring1, outstring = "";
    StringBuffer substring2 = new StringBuffer();

    public PalindromeClass(){
        this.outstring = "";
        this.substring1 = "";
        this.substring2 = new StringBuffer();
    }

    public PalindromeClass(String str){
        this.outstring = str;
    }

    public PalindromeClass(Scanner sc){
        this(sc.nextLine());
    }

    public String getPalindrome(Scanner sc){
        while (sc.hasNext()) {
            substring1 = sc.next();
            substring2.append(substring1);
            substring2.reverse();

            if (substring1.equals(substring2.toString())){
                if (outstring.length() <= substring1.length()) {
                    outstring = substring1;
                }
            }
            substring2 = new StringBuffer();
        }
        return outstring;
    }

    public StringBuffer readText(Scanner sc){
        while (sc.hasNext()) {
            outstring = sc.next();
            substring2.append(outstring + " ");
        }
        return substring2;
    }
}
