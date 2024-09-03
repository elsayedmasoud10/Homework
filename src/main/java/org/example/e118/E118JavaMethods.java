package org.example.e118;

public class E118JavaMethods {

    public static void main(String[] args) {

        spaceOut("Hello","tecnology");
    }
        // Students will write the code here.
        public static void spaceOut(String word, String word2) {

        System.out.println(word.replaceAll(".", "$0 "));
        System.out.println(word2.replaceAll(".", "$0 "));

    }
}
