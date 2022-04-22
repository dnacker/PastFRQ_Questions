package Q1;

/**
 * Question 1
 */
public class RandomLetterChooser extends RandomStringChooser {
    /** Constructs a random letter chooser using the given string str.
     *  Precondition: str contains only letters.
     */
    public RandomLetterChooser(String str) {
        /* to be implemented in part (b) */
    }

    /** Returns an array of single-letter strings.
     *  Each of these strings consists of a single letter from str. Element k
     *  of the returned array contains the single letter at position k of str.
     *  For example, getSingleLetters("cat") returns the
     *  array {"c", "a", "t"}.
     */
    public static String[] getSingleLetters(String str) {
        String[] text = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            text[i] = str.substring(i, i + 1);
        }
        return text;
    }
}
