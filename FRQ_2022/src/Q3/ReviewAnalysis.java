package Q3;

import java.util.ArrayList;

public class ReviewAnalysis {
    /** All user reviews to be included in this analysis */
    private Review[] allReviews;
    /** Initializes allReviews to contain all the Review objects to be analyzed */
    public ReviewAnalysis() {
        /* implementation not shown */
    }

    /** Returns a double representing the average rating of all the Review objects to be
     * analyzed, as described in part (a)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     */
    public double getAverageRating() {
        double total = 0;
        for (int i = 0; i < allReviews.length; i++) {
            total += allReviews[i].getRating();
        }
        return total / allReviews.length;
//        /* to be implemented in part (a) */
//        return Double.MAX_VALUE;
    }
    /** Returns an ArrayList of String objects containing formatted versions of
     * selected user comments, as described in part (b)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     * Postcondition: allReviews is unchanged.
     */
    public ArrayList<String> collectComments() {
        ArrayList<String> comments = new ArrayList<>();
        for (int i = 0; i < allReviews.length; i++) {
            Review review = allReviews[i];
            String comment = review.getComment();
            if (comment.indexOf("!") >= 0) {
                String result = i + "-" + comment;
                if (!result.endsWith(".") && !result.endsWith("!")) {
                    result += ".";
                }
                comments.add(result);
            }
        }
        return comments;
//        /* to be implemented in part (b) */
//        return null;
    }

    void setAllReviews(Review[] reviews) {
        this.allReviews = reviews;
    }
}