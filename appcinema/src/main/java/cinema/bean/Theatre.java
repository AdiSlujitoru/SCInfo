package cinema.bean;


public class Theatre {

    private String theatreName;

    private String city;

    private int zipcode;

    private String time;


    public Theatre() {
    }


    public Theatre(String theatreName, String city, int zipcode, String time) {
        this.theatreName = theatreName;
        this.city = city;
        this.zipcode = zipcode;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
