public class Jacket extends Clothes {

    private String type;    // 2 buttons, 3 buttons, hood, no butons, zipper(default)

    public Jacket() {
        super();
        super.setShortlength(false);
        type = "zipper";
    }

    public Jacket(String material, String color, boolean casual, boolean shortlength, String type) {
        super(material, color, casual, shortlength);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String showJacket() {
        String msg;

        if (this.isShortlength())
            msg = "short";
        else
            msg = "long";


        return this.getColor() + " " + msg + " " +
                this.getMaterial() + " jacket with " + this.getType();
    }

}
