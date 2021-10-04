package inheritance;

public class MovieReview extends Review {

    private String movie;

    public MovieReview(String body, String author, int stars) {
        this(body,author,stars,"Didn't Watch");

    }

    public MovieReview(String body, String author, int stars, String movie) {
        super(body, author, stars);
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }
}
