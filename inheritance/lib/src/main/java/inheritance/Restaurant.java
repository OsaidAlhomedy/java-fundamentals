package inheritance;

import java.util.ArrayList;

// The restaurant implements the review because each restaurant got its own reviews
public class Restaurant {

    /////////////////Fields

    private int totalStars;

    private String name;
    private String price;
    private ArrayList<String> reviews = new ArrayList<>();
    private ArrayList<Integer> starsArray = new ArrayList<>();

    ////////////////Constructors


    public Restaurant(String name) {
        this(name, "Not Specified");
    }

    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
    }


    ///////////////////////////////

    private void calculateTotalStars() {
        int totalSum = 0;
        for (Integer item : starsArray) {
            totalSum = totalSum + item;
        }
        this.totalStars = totalSum / starsArray.size();
    }


    public String addReview(Review review) {
        if (review.getStars() < 0 || review.getStars() > 5) {
            return "Please Choose a rating between 0 and 5 stars";
        } else {
            String userReview = "Reviewer : " + review.getAuthor() + "\n" + "Review : " + review.getBody() + "\n" + "Rating :  " + review.getStars() + " stars" + "\n";

            setReviews(userReview);
            setStarsArray(review.getStars());

            this.calculateTotalStars();
            return null;
        }

    }


    /////////////Getters

    public String getName() {
        return name;
    }

    public int getTotalStars() {
        return totalStars;
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

    //////////// toString OverRiding
    @Override
    public String toString() {

        return "\nRestaurant : " + name + '\n' +
                "Price Category : " + price + '\n' +
                "Stars : " + totalStars + '\n' + "===========" + "\n" +
                "Reviews : \n" + reviews;
    }
}
