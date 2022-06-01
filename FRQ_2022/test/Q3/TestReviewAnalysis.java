package Q3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestReviewAnalysis {

    ReviewAnalysis test = new ReviewAnalysis();

    @Test
    public void testGetAverageRatingOneReview() {
        test.setAllReviews(new Review[] {
                new Review(10, "foo")
        });

        Assert.assertEquals(10.0, test.getAverageRating(), 0.01);
    }

    @Test
    public void testGetAverageRatingTwoReviews() {
        test.setAllReviews(new Review[] {
                new Review(10, "foo"),
                new Review(20, "bar")
        });

        Assert.assertEquals(15.0, test.getAverageRating(), 0.01);
    }

    @Test
    public void testGetAverageRatingManyReviews() {
        // Sum of numbers from 1 to 10 = 55
        Review[] reviews = new Review[10];
        for (int i = 0; i < reviews.length; i++) {
            reviews[i] = new Review(i + 1, "");
        }
        test.setAllReviews(reviews);

        // 55 / 10 = 5.5
        Assert.assertEquals(5.5, test.getAverageRating(), 0.01);
    }

    @Test
    public void testCollectCommentsEmpty() {
        test.setAllReviews(new Review[]{
                new Review(1, "foo")
        });

        Assert.assertEquals(new ArrayList<>(), test.collectComments());
    }

    @Test
    public void testCollectCommentsOneExclamation() {
        test.setAllReviews(new Review[]{
                new Review(1, "foo!")
        });

        Assert.assertEquals(Arrays.asList("0-foo!"), test.collectComments());
    }

    @Test
    public void testCollectCommentsOneExclamationNoPeriod() {
        test.setAllReviews(new Review[]{
                new Review(1, "foo! bar")
        });

        Assert.assertEquals(Arrays.asList("0-foo! bar."), test.collectComments());
    }

    @Test
    public void testCollectCommentsMultipleComments() {
        test.setAllReviews(new Review[]{
                new Review(1, "foo!"),
                new Review(1, "bar"),
                new Review(1, ""),
                new Review(1, "!zee"),
                new Review(1, "fizz"),
        });

        Assert.assertEquals(Arrays.asList("0-foo!", "3-!zee."), test.collectComments());
    }
}
