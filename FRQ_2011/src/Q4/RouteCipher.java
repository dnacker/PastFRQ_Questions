package Q4;

import java.util.Arrays;

/**
 * Question 4.
 */
public class RouteCipher {
    /** A two-dimensional array of single-character strings, instantiated in the constructor */
    private String[][] letterBlock;

    /** The number of rows of letterBlock, set by the constructor */
    private int numRows;
    /** The number of columns of letterBlock, set by the constructor */
    private int numCols;

    public RouteCipher(int rows, int cols) {
        letterBlock = new String[rows][cols];
        numRows = rows;
        numCols = cols;
    }

    /** Places a string into letterBlock in row-major order.
     * @param str the string to be processed
     * Postcondition:
     * if str.length() < numRows * numCols, "A" is placed in each unfilled cell
     * if str.length() > numRows * numCols, trailing characters are ignored
     */
    public void fillBlock(String str) {
        //your code for part (a)
    }

    /**
     * IGNORE THIS CODE.
     * Extracts encrypted string from letterBlock in column-major order.
     * Precondition: letterBlock has been filled
     * @return the encrypted string from letterBlock
     */
    private String encryptBlock() {
        String result = "";
        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row < numRows; row++) {
                result += letterBlock[row][col];
            }
        }
        return result;
    }

    /** Encrypts a message.
     * @param message the string to be encrypted
     * @return the encrypted message;
     * if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message) {
        //your code for part (b)
        return "";
    }

    public String toString() {
        String res = "[";
        for (int i = 0; i < letterBlock.length; i++) {
            res += Arrays.toString(letterBlock[i]);
            if (i != letterBlock.length - 1) {
                res += ", ";
            }
        }
        res += "]";
        return res;
    }

    /*
    public static void main(String[] args) {
        String msg1 = "Meet at noon";
        RouteCipher cipher1 = new RouteCipher(3, 5);
        cipher1.fillBlock(msg1);
        System.out.println(cipher1);
        System.out.println(cipher1.encryptMessage(msg1));
        String msg2 = "Meet at midnight";
        RouteCipher cipher2 = new RouteCipher(2, 3);
        System.out.println(cipher2.encryptMessage(msg2));

    }
    */
}
