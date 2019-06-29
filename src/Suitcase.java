import java.util.Random;

public class Suitcase {
    private Jacket jacketItem;
    private Shirt shirtItem;
    private Pants pantsItem;
    private Shoes shoesItem;

    public Suitcase() {
        this.jacketItem = null;
        this.shirtItem = null;
        this.pantsItem = null;
        this.shoesItem = null;
    }

    public Suitcase(Jacket jacketItem, Shirt shirtItem, Pants pantsItem, Shoes shoesItem) {
        this.jacketItem = jacketItem;
        this.shirtItem = shirtItem;
        this.pantsItem = pantsItem;
        this.shoesItem = shoesItem;
    }

    public Jacket getJacketItem() {
        return jacketItem;
    }

    public void setJacketItem(Jacket jacketItem) {
        this.jacketItem = jacketItem;
    }

    public Shirt getShirtItem() {
        return shirtItem;
    }

    public void setShirtItem(Shirt shirtItem) {
        this.shirtItem = shirtItem;
    }

    public Pants getPantsItem() {
        return pantsItem;
    }

    public void setPantsItem(Pants pantsItem) {
        this.pantsItem = pantsItem;
    }

    public Shoes getShoesItem() {
        return shoesItem;
    }

    public void setShoesItem(Shoes shoesItem) {
        this.shoesItem = shoesItem;
    }

    public Jacket lookForJacket(String color) {
        String str = this.jacketItem.getColor();

        if (color.equalsIgnoreCase(str))
            return this.jacketItem;
        else
            return null;
    }

    public Shirt lookForShirt(String color) {
        String str = this.shirtItem.getColor();

        if (color.equalsIgnoreCase(str))
            return this.shirtItem;
        else
            return null;
    }

    public Pants lookForPants(String color) {
        String str = this.pantsItem.getColor();

        if (color.equalsIgnoreCase(str))
            return this.pantsItem;
        else
            return null;
    }


    public String showSuitcase() {
        String jacket, shirt, pants, shoes;

        if (this.jacketItem != null)
            jacket = this.jacketItem.showJacket();
        else
            jacket = "no jackets";

        if (this.shirtItem != null)
            shirt = this.shirtItem.showShirt();
        else
            shirt = "no shirt";

        if (this.pantsItem != null)
            pants = this.pantsItem.showPants();
        else
            pants = "no pants";

        if (this.shoesItem != null)
            shoes = this.shoesItem.showShoes();
        else
            shoes = "no shoes";

        String msg = jacket + ", " + shirt + ", " + pants + ", and " + shoes;


        return msg;

    }

}


