
import java.util.ArrayList;


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

        Shirt item = new Shirt ("linen", "red", true, true, "uTshirt" );
        this.addShirt(item);

        item = new Shirt ("Denim", "white", true, true, "buttons" );
        this.addShirt(item);

        item = new Shirt ("Fur", "brown", true, true, "collarshirt" );
        this.addShirt(item);

        item = new Shirt ("cotton", "brown", true, true, "vTshrit" );
        this.addShirt(item);
    }

    public void initalizePants() {
        Pants item = new Pants ("linen", "red", true, true, "jean");
        this.addPants(item);

        item = new Pants ("linen", "red", true, true, "sweat");
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


    }

}
