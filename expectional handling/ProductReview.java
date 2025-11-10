// 11. Product Review System
class InvalidRatingException extends Exception { public InvalidRatingException(String msg){super(msg);} }
class EmptyReviewException extends Exception { public EmptyReviewException(String msg){super(msg);} }

class ReviewSystem {
    public void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {
        if (rating < 1 || rating > 5)
            throw new InvalidRatingException("Rating must be between 1 and 5!");
        if (comment == null || comment.trim().isEmpty())
            throw new EmptyReviewException("Review comment cannot be empty!");
        System.out.println("Review submitted successfully!");
    }
}

public class ProductReview {
    public static void main(String[] args) {
        ReviewSystem rs = new ReviewSystem();
        try {
            rs.submitReview(6, "");
        } catch (InvalidRatingException e) {
            System.out.println(e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println(e.getMessage());
        }
    }
}
