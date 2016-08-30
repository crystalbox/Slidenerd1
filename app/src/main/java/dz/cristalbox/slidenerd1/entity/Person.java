package dz.cristalbox.slidenerd1.entity;

/**
 * Created by cristalbox on 8/16/2016.
 */
public class Person {
    private int _id;
    private String title;
    private String description;
    private int img;

    public Person(String title, String description, int img) {
        this.title = title;
        this.description = description;
        this.img = img;
    }

    public Person() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}
