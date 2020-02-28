package edu.foxminded.javaCourse.anagram_alternative;

public class Main {

    public static void main(String[] args) {
        String originalText = "a1bcd? efg!h, <>?%@/  фыва33йцук  sdgf<j,kl.                 123";
        StringBuilder stringBuilder = new StringBuilder(originalText);
        
        String reversed = String.join(" ", stringBuilder.reverse());
        System.out.println(reversed);
//        System.out.print(anagram.reverse(originalText));
//        System.out.println("123");

    }

}
