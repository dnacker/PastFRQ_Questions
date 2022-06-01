package Q1;

import org.junit.Assert;
import org.junit.Test;

public class TestGame {
    static class MultiGame extends Game {
        int[] scores;
        int index = -1;

        MultiGame(int[] scores) {
            this.scores = scores;
        }

        @Override
        public void play() {
            index++;
        }

        public int getScore() {
            return scores[index];
        }
    }

    static class BonusGame extends Game {
        @Override
        public boolean isBonus() {
            return true;
        }
    }

    @Test
    public void testGetScoreNoLevel() {
        Game game = new Game();
        game.setLevels(new Level[]{
                new Level(false, 1),
                new Level(false, 2),
                new Level(false, 4)
        });

        Assert.assertEquals(0, game.getScore());
    }

    @Test
    public void testGetScoreSecondLevelThirdLevel() {
        Game game = new Game();
        game.setLevels(new Level[]{
                new Level(false, 1),
                new Level(true, 2),
                new Level(true, 4)
        });

        Assert.assertEquals(0, game.getScore());
    }

    @Test
    public void testGetScoreFirstLevel() {
        Game game = new Game();
        game.setLevels(new Level[]{
                new Level(true, 1),
                new Level(false, 2),
                new Level(false, 4)
        });

        Assert.assertEquals(1, game.getScore());
    }

    @Test
    public void testGetScoreFirstLevelThirdLevel() {
        Game game = new Game();
        game.setLevels(new Level[]{
                new Level(true, 1),
                new Level(false, 2),
                new Level(true, 4)
        });

        Assert.assertEquals(1, game.getScore());
    }

    @Test
    public void testGetScoreFirstLevelSecondLevel() {
        Game game = new Game();
        game.setLevels(new Level[]{
                new Level(true, 1),
                new Level(true, 2),
                new Level(false, 4)
        });

        Assert.assertEquals(3, game.getScore());
    }

    @Test
    public void testGetScoreFirstLevelSecondLevelThirdLevel() {
        Game game = new Game();
        game.setLevels(new Level[]{
                new Level(true, 1),
                new Level(true, 2),
                new Level(true, 4)
        });

        Assert.assertEquals(7, game.getScore());
    }

    @Test
    public void testGetScoreBonusTriplesValue() {
        Game game = new BonusGame();
        game.setLevels(new Level[]{
                new Level(true, 1),
                new Level(true, 2),
                new Level(true, 4)
        });


        Assert.assertEquals(21, game.getScore());
    }

    @Test
    public void testPlayManyTimesMultipleGames() {
        Game mockGame = new MultiGame(new int[] { 5, 10, 15 });

        Assert.assertEquals(15, mockGame.playManyTimes(3));
    }

    @Test
    public void testPlayManyTimesSingleGame() {
        Game mockGame = new MultiGame(new int[] { 5 });

        Assert.assertEquals(5, mockGame.playManyTimes(1));
    }

    @Test
    public void testPlayManyTimesRandom() {
        int randomSize = (int) (Math.random() * 50) + 1;
        int[] randomArray = new int[randomSize];
        int expectedScore = -1;
        for (int i = 0; i < randomArray.length; i++) {
            int score = (int) (Math.random() * 10000);
            randomArray[i] = score;
            if (score > expectedScore) {
                expectedScore = score;
            }
        }

        Game mockGame = new MultiGame(randomArray);

        Assert.assertEquals(expectedScore, mockGame.playManyTimes(randomSize));
    }


}
