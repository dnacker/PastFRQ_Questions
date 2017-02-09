package Q1;

import java.util.Arrays;

/**
 * Created by David on 1/22/2017.
 */
public class WordScrambler {
    private String[] scrambleWords;

    public WordScrambler(String[] wordArr) {
        scrambleWords = mixedWords(wordArr);
    }

    public String toString() {
        return Arrays.toString(scrambleWords);
    }

    public static void main(String[] args) {
        String[] words = {"apple", "pear", "this", "cat", "foo"};
        WordScrambler scrambler = new WordScrambler(words);
        System.out.println(scrambler.recombine(words[0], words[1]));
        System.out.println(scrambler.recombine(words[1], words[0]));
        System.out.println(scrambler);
    }


    private String recombine(String word1, String word2) {
        return word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2);
    }


    private String[] mixedWords(String[] words) {
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i += 2) {
            String first = words[i];
            String second = words[i + 1];
            result[i] = recombine(first, second);
            result[i + 1] = recombine(second, first);

        }
        return result;
    }










    /*
    private String recombine(String word1, String word2) {
        return word1.substring(0, word1.length()/2) + word2.substring(word2.length()/2);
    }

    private String[] mixedWords(String[] words) {
        String[] mixed = new String[words.length];
        int index = 0;
        for (int i = 0; i < words.length/2; i++) {
            mixed[index] = recombine(words[2*i], words[2*i + 1]);
            index++;
            mixed[index] = recombine(words[2*i + 1], words[2*i]);
            index++;
        }
        return mixed;
    }
    8
    */
}
