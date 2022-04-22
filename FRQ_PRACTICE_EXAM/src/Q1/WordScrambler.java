package Q1;

public class WordScrambler {
    private String[] scrambledWords;

    /** @param wordArr an array of String objects
     * Precondition: wordArr.length is even
     */
    public WordScrambler(String[] wordArr) {
        scrambledWords = mixedWords(wordArr);
    }

    /** @param word1 a String of characters
     *	 @param word2 a String of characters
     *	 @return a String that contains the first half of word1 and the second half of word2
     */
    public static String recombine(String word1, String word2) {
        /* to be implemented in part (a) */
        return null;
    }

    /** @param words an array of String objects
     * Precondition: words.length is even
     *	 @return an array of String objects created by recombining pairs of strings in array words
     *	 Postcondition: the length of the returned array is words.length
     */
    private String[] mixedWords(String[] words) {
        /* to be implemented in part (b) */
        return null;
    }

    // Ignore these methods. Used for testing.
    public String[] getScrambledWords() {
        return scrambledWords;
    }
}
