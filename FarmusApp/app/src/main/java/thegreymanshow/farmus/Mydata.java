package thegreymanshow.farmus;

/**
 * Created by Parth on 1/28/2017.
 */
public class Mydata {

    private int id;
    private String description,image;

    public Mydata(int id,String description, String image){
        this.id = id;
        this.description = description;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image= image;
    }


}
