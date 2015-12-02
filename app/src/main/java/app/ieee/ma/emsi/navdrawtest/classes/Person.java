package app.ieee.ma.emsi.navdrawtest.classes;


public class Person {

    private String _name;
    private String _title;
    private String _Description;
    private int _imageUrl;

    public Person(String _name, String _title, String _Description, int _imageUrl) {
        this._name = _name;
        this._title = _title;
        this._Description = _Description;
        this._imageUrl = _imageUrl;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_Description() {
        return _Description;
    }

    public void set_Description(String _Description) {
        this._Description = _Description;
    }

    public int get_imageUrl() {
        return _imageUrl;
    }

    public void set_imageUrl(int _imageUrl) {
        this._imageUrl = _imageUrl;
    }
}
