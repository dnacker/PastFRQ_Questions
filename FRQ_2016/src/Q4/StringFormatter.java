package Q4;

import java.util.List;

/**
 * Question 4
 */
public class StringFormatter {

    /** Returns the total number of letters in wordList
     *  Precondition: wordList contains at least two words consisting of letters only.
     */
    public static int totalLetters(List<String> wordList) {
        /* to be implemented in part (a) */
        return 0;
    }

    /** Returns the basic gap width when wordList is used to produce
     *  a formatted string of formattedLen characters.
     *  Precondition: wordList contains at least two words, consisting of letters only.
     *                formattedLen is large enough for all the words and gaps.
     */
    public static int basicGapWidth(List<String> wordList, int formattedLen) {
		/* to be implemented in part (b) */
        return 0;
    }


    /** Returns a formatted string consisting of the words in wordList separated by spaces.
     *  Precondition: wordList contains at least two words, consisting of letters only.
     *                formattedLen is large enough for all the words and gaps.
     *  Postcondition: All words in wordList appear in the formatted string.
     *      - The words appear in the same order as in wordList.
     *      - The number of spaces between words is determined by basicGapWidth and the
     *      distribution of leftoverSpaces from left to right, as described in the question.
     */
    public static String format(List<String> wordList, int formattedLen) {
        /* to be implemented in part (c) */
        return null;
    }

    /** Returns the number of leftover spaces when wordList is used to produce
     *  a formatted string of formattedLen characters.
     *  Precondition: wordList contains at least two words, consisting of letters only.
     *                formattedLen is large enough for all the words and gaps.
     */
    public static int leftoverSpaces(List<String> wordList, int formattedLen) {
        return (formattedLen - totalLetters(wordList)) % (wordList.size() - 1);
    }
}
