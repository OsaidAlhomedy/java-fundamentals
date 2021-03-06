package inheritance;

import java.util.ArrayList;

// The restaurant implements the review because each restaurant got its own reviews
public class Restaurant extends ThingsToReview{


    public Restaurant(String name, String price) {
        super(name, price);
    }

    //////////// toString OverRiding
    @Override
    public String toString() {

        return "\nRestaurant : " + this.getName() + '\n' +
                "Price Category : " + this.getPrice() + '\n' +
                "Stars : " + this.getTotalStars() + '\n' + "===========" + "\n" +
                "Reviews : \n" + this.getReviews();
    }
}
