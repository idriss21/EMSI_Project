package app.ieee.ma.emsi.navdrawtest.classes;


public class Commitee {

    private  String Title;
    private String Description;

    public  Commitee(String title , String Descrip )
    {
        this.Title = title;
        this.Description = Descrip;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
