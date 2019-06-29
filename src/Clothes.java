public class Clothes {
    private String material;
    private String color;
    private boolean casual;       // default is true
    private boolean shortlength;  // set to false if long (default is true)

    public Clothes(){
        material = "";
        color = "";
        casual = true;
        shortlength = true;
    }

    public Clothes(String material, String color, boolean casual, boolean shortlength) {
        this.material = material;
        this.color = color;
        this.casual = casual;
        this.shortlength = shortlength;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCasual() {
        return casual;
    }

    public void setCasual(boolean casual) {
        this.casual = casual;
    }

    public boolean isShortlength() {
        return shortlength;
    }

    public void setShortlength(boolean shortlength) {
        this.shortlength = shortlength;
    }
}


