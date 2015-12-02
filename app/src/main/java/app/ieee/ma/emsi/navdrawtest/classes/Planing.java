package app.ieee.ma.emsi.navdrawtest.classes;

/**
 * Created by idriss on 28/11/2015.
 */
public class Planing {
    private int id;
    private String description;
    private  String date;
    private String location;
    private String time;

    public Planing(String time, String description, String location) {
        this.time = time;
        this.description = description;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
