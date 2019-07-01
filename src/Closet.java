import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Closet {
    private static ArrayList<Jacket> allJackets;
    private static ArrayList<Shirt> allShirts;
    private static ArrayList<Pants> allPants;
    private static ArrayList<Shoes> allShoes;

    public Closet() {
        allJackets = new ArrayList<Jacket>();
        allShirts = new ArrayList<Shirt>();
        allPants = new ArrayList<Pants>();
        allShoes = new ArrayList<Shoes>();
    }

    public Jacket getJackets(int ith) {
        Jacket item = this.allJackets.get(ith);
        return item;
    }

    public void addJackets(Jacket jackets) {
        allJackets.add(jackets);
    }

    public int getJacketNo() {
        return allJackets.size();
    }

    public Shirt getShirt(int ith) {
        Shirt item = this.allShirts.get(ith);
        return item;
    }

    public void addShirt(Shirt item) {
        allShirts.add(item);
    }

    public int getShirtNo() {
        return allShirts.size();
    }

    public Pants getPants(int ith) {
        Pants item = this.allPants.get(ith);
        return item;
    }

    public void addPants(Pants item) {
        allPants.add(item);
    }

    public int getPantsNo() {
        return allPants.size();
    }

    public Shoes getShoes(int ith) {
        Shoes item = this.allShoes.get(ith);
        return item;
    }

    public void addShoes(Shoes item) {
        allShoes.add(item);
    }

    public int getShoesNo() {
        return allShoes.size();
    }

    public void initalizeJackets() {
        Jacket item = new Jacket("cotton", "blue", true,
                false, "2 buttons");
        this.addJackets(item);

        item = new Jacket("linen", "brown", true,
                false, "3 buttons");
        this.addJackets(item);

        item = new Jacket("polyester", "grey", true,
                false, "hood");
        this.addJackets(item);

        item = new Jacket("linen", "yellow", true,
                false, "no butons");
        this.addJackets(item);

    }

    public void initalizeShirts() {

        Shirt item = new Shirt ("linen", "red", true, true, "u neck" );
        this.addShirt(item);

        item = new Shirt ("Denim", "white", true, true, "buttons" );
        this.addShirt(item);

        item = new Shirt ("Fur", "brown", true, true, "collart" );
        this.addShirt(item);

        item = new Shirt ("cotton", "brown", true, true, "v neck" );
        this.addShirt(item);
    }

    public void initalizePants() {
        Pants item = new Pants ("cotton", "red", true, true, "jean");
        this.addPants(item);

        item = new Pants ("polyester", "red", true, true, "sweat");
        this.addPants(item);

        item = new Pants ("linen", "red", true, true, "dress");
        this.addPants(item);
    }

    public void initalizeShoes() {
        // types for shoes are heels, sneakers, sandles, dress, casual (default)
        Shoes item = new Shoes ("linen", "red", "heel");
        this.addShoes(item);

        item = new Shoes ("fur", "red", "sneakers");
        this.addShoes(item);

        item = new Shoes ("denim", "blue", "sandles");
        this.addShoes(item);

        item = new Shoes ("velvet", "black", "dress");
        this.addShoes(item);

        item = new Shoes ("velvet", "black", "heels");
        this.addShoes(item);






    }




    /***********************
    public Closet() {
        this.jacketItem = null;
        this.shirtItem = null;
        this.pantsItem = null;
        this.shoesItem = null;
    }

    public Closet(Jacket jacketItem, Shirt shirtItem, Pants pantsItem, Shoes shoesItem) {
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

    public Jacket lookForJacket(String color){
        String str = this.jacketItem.getColor();

        if (color.equalsIgnoreCase(str))
            return  this.jacketItem;
        else
            return null;
    }

    public Shirt lookForShirt(String color){
        String str = this.shirtItem.getColor();

        if (color.equalsIgnoreCase(str))
            return  this.shirtItem;
        else
            return null;
    }

    public Pants lookForPants(String color){
        String str = this.pantsItem.getColor();

        if (color.equalsIgnoreCase(str))
            return  this.pantsItem;
        else
            return null;
    }
**************************/

}
