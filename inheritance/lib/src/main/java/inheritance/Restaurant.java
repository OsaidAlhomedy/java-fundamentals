package inheritance;

import java.util.ArrayList;

// The restaurant implements the review because each restaurant got its own reviews
public class Restaurant implements IReview {

    /////////////////Fields
    private String name;
    private String price;
    private int totalStars;
    private ArrayList<String> reviews = new ArrayList<>();
    private ArrayList<Integer> starsArray = new ArrayList<>();

    ////////////////Constructors

    public Restaurant() {
    }

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

    @Override
    public String addReview(String body, String author, int stars) {
        if (stars < 0 || stars > 5) {
            return "Please Choose a rating between 0 and 5 stars";
        } else {
            String userReview = "Reviewer : " + author + "\n" + "Review : " + body + "\n" + "Rating :  " + stars + " stars" + "\n";
            this.reviews.add(userReview);
            this.starsArray.add(stars);
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

    //////////// toString OverRiding
    @Override
    public String toString() {

        return "\nRestaurant : " + name + '\n' +
                "Price Category : " + price + '\n' +
                "Stars : " + totalStars + '\n' + "===========" + "\n" +
                "Reviews : \n" + reviews;
    }
}
