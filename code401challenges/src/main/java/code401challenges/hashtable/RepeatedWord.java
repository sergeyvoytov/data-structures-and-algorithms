package code401challenges.hashtable;

import java.util.HashSet;

public class RepeatedWord {
//https://javarevisited.blogspot.com/2016/02/how-to-remove-all-special-characters-of-String-in-java.html

    public static String repeatedWord(String string) {
        String[] textToArray = string.toLowerCase().replaceAll("[^a-z]", " ").split(" ");
//        System.out.println(textToArray.length);


        Hashtable lookingAt = new Hashtable();
        for (String potato : textToArray) {
            if (lookingAt.contains(potato)) {
                return potato;
            } else {
                lookingAt.add(potato, "something");
            }
        }
        return "No repetitions";
    }
}
