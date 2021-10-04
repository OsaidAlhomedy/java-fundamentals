package inheritance;

import java.util.ArrayList;

public class Theater extends ThingsToReview {

    private ArrayList<String> movieList = new ArrayList<>();

    public Theater(String name, ArrayList<String> list) {
        this.setName(name);
        this.movieList = list;
    }

    public void addMovie(String movie) {
        this.movieList.add(movie);
    }

    public void removeMovie(String movie) {
        this.movieList.remove(movie);
    }

    public ArrayList<String> getMovieList() {
        return movieList;
    }


    @Override
    public void addReview(Review review) {
        MovieReview reviewModed = (MovieReview) review;
        String userReview = "Reviewer : " + review.getAuthor() + "\n" + "Review : " + review.getBody() + "\n" + "Rating :  " + review.getStars() + " stars" + "\n" + "Movie Watched : " + reviewModed.getMovie()+"\n";
        super.addReview(review);
        super.getReviews().set(getReviews().size() - 1, userReview);
    }

    @Override
    public String toString() {
        return "\nTheater : " + this.getName() + '\n' +
                "Stars : " + this.getTotalStars() + "\n" +
                "===========" + "\n" +
                "Movies Availavble : " + "\n" +
                this.getMovieList() + "\n" +
                "===========" + "\n" +
                "Reviews : \n" + this.getReviews();
    }
}
