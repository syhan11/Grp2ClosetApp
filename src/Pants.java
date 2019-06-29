public class Pants extends Clothes {

    private String type;   // jean (default) , sweat, dress, casual

    public Pants() {
        super();
        this.type = "jean";
    }

    public Pants(String material, String color, boolean casual, boolean shortlength, String type) {
        super(material, color, casual, shortlength);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String showPants() {
        String msg;

        if (this.isShortlength())
            msg = "short";
        else
            msg = "long";


        return this.getColor() + " " + msg + " " +
                this.getMaterial() + " " + this.getType() + " pants";
    }
}
