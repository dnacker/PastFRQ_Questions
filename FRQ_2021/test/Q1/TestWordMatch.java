package Q1;

import org.junit.Assert;
import org.junit.Test;

public class TestWordMatch {
    WordMatch mockMatch = new WordMatch("foo") {
        @Override
        public int scoreGuess(String guess) {
            if (guess.equals("a") || guess.equals("b")) {
                return 6;
            }
            return 7;
        }
    };

    @Test
    public void testScoreGuessDoesntAppear() {
        String guess = "c";
        String secret = "aabbaa";
        int expected = 0;
        Assert.assertEquals(expected, new WordMatch(secret).scoreGuess(guess));
    }

    @Test
    public void testScoreGuessSingleLetterAppearsOnce() {
        String guess = "c";
        String secret = "aabcbaa";
        int expected = 1;
        Assert.assertEquals(expected, new WordMatch(secret).scoreGuess(guess));
    }

    @Test
    public void testScoreGuessSingleLetterAppearsMultipleTimes() {
        String guess = "a";
        String secret = "aabbaa";
        int expected = 4;
        Assert.assertEquals(expected, new WordMatch(secret).scoreGuess(guess));
    }

    @Test
    public void testScoreGuessMultiLetterAppearsOnce() {
        String guess = "abba";
        String secret = "aabbaa";
        int expected = 16;
        Assert.assertEquals(expected, new WordMatch(secret).scoreGuess(guess));
    }

    @Test
    public void testScoreGuessMultiLetterAppearsMultipleTimes() {
        String guess = "aa";
        String secret = "aabbaa";
        int expected = 8;
        Assert.assertEquals(expected, new WordMatch(secret).scoreGuess(guess));
    }

    @Test
    public void testFindBetterGuessReturnsHigherScore() {
        Assert.assertEquals("c", mockMatch.findBetterGuess("a", "c"));
        Assert.assertEquals("c", mockMatch.findBetterGuess("c", "a"));
    }

    @Test
    public void testFindBetterGuessSameScoreReturnsGreaterString() {
        Assert.assertEquals("b", mockMatch.findBetterGuess("a", "b"));
        Assert.assertEquals("b", mockMatch.findBetterGuess("b", "a"));
    }
}
