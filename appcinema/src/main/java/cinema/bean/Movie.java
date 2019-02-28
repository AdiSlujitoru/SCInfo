package cinema.bean;

//import javax.persistence.Column;
//import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Movie {

    private String movieName;

    private String actorName;

    private String genre;

    private String length;

    private String image;

    public Movie(String movieName, String actorName, String genre, String length, String image) {
        this.movieName = movieName;
        this.actorName = actorName;
        this.genre = genre;
        this.length = length;
        this.image = image;
    }

    public Movie() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
