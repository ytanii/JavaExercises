import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;


    public GeometricObject() {
        this("white", false);
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();

    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;

    }

    public Date getDateCreated() {
        return new Date(dateCreated.getTime());
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
