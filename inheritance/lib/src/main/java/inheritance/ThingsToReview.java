package inheritance;

import java.util.ArrayList;

public abstract class ThingsToReview {
    private String name;
    private String price;
    private int totalStars;
    private ArrayList<String> reviews = new ArrayList<>();
    private ArrayList<Integer> starsArray = new ArrayList<>();

    public ThingsToReview() {

    }

    public ThingsToReview(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public void addReview(Review review) {
        if (!(review.getStars() < 0) || !(review.getStars() > 5)) {
            String userReview = "Reviewer : " + review.getAuthor() + "\n" + "Review : " + review.getBody() + "\n" + "Rating :  " + review.getStars() + " stars" + "\n";
            this.setReviews(userReview);
            this.setStarsArray(review.getStars());
            this.calculateTotalStars();
        }
    }

    private void calculateTotalStars() {
        int totalSum = 0;
        for (Integer item : starsArray) {
            totalSum = totalSum + item;
        }
        this.totalStars = totalSum / starsArray.size();
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setReviews(String review) {
        this.reviews.add(review);
    }

    public void setStarsArray(int stars) {
        this.starsArray.add(stars);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }


    public int getTotalStars() {
        return totalStars;
    }

}
