package Q3;

/* Question 3. */
public class Phrase {
    private String currentPhrase;

    public Phrase(String p) {
        currentPhrase = p;
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
     *  returns -1 if the nth occurrence does not exist.
     *  Precondition: str.length() > 0 and n > 0
     *  Postcondition: the current phrase is not modified.
     */
    public int findNthOccurrence(String str, int n) {
        int count = 1;
        int idx = currentPhrase.indexOf(str);
        while (count < n && 0 <= idx && idx < currentPhrase.length()) {
            count++;
            idx = currentPhrase.indexOf(str, idx + 1);
        }
        return idx;
    }

    public void replaceNthOccurrence(String str, int n, String repl) {
        int indx = findNthOccurrence(str, n);
		if (indx != -1) {
			currentPhrase = currentPhrase.substring(0, indx) + repl + currentPhrase.substring(indx + str.length());
		}
    }

    public int findLastOccurrence(String str) {
        int occur = 1;
        int index = findNthOccurrence(str, occur);
        int current = index;
        while (current != -1) {
            occur++;
            current = findNthOccurrence(str, occur);
            if (current != -1) {
                index = current;
            }
        }
        return index;
    }

    public String toString() {
        return currentPhrase;
    }

    /* Ignore code below. For testing purposes.
    public static void main(String[] args) {
        Phrase phrase1 = new Phrase("A cat ate late.");
        for (int i = 1; i <= 4; i++) {
            System.out.println(phrase1.findNthOccurrence("at", i));
        }
    }
    */
}
