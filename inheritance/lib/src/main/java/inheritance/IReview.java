package inheritance;


public interface IReview {

    String body = null;
    String author = null;
    int stars = 0;

    String addReview(String body,String author,int stars);

}
