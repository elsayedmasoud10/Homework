package org.example.e119;

public class E119JavaMethods {
    public static void main(String[] args) {
        // Students will write the code here.
        censorLetter("computer science","trick or treat");
    }  public static void censorLetter(String word, String word2){
        System.out.println(word.replaceAll("e", "*"));
        System.out.println(word2.replaceAll("t", "*"));
    }
    }



