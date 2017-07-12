package thegreymanshow.farmus;

/**
 * Created by Parth on 1/28/2017.
 */
public class Mydata2 {

    private int id;
    private String name,description,reference;

    public Mydata2(int id,String name,String description,String reference){
        this.id = id;
        this.name = name;
        this.description = description;
        this.reference = reference;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
