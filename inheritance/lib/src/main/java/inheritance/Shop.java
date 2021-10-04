package inheritance;

import java.util.ArrayList;

public class Shop extends ThingsToReview{

    private String description;

    public Shop(String name,String description, String price) {
        super(name, price);
        this.description = description;
    }


    @Override
    public String toString() {
        return "\nShop : " + this.getName() +
                "\nDesciption : " + this.description + '\n' +
                "Price Category : " + this.getPrice() + '\n' +
                "Stars : " + this.getTotalStars() + '\n' + "===========" + "\n" +
                "Reviews : \n" + this.getReviews();
    }
}
