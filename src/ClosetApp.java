import java.util.ArrayList;
import java.util.Random;

public class ClosetApp {

    public static Closet myCloset = new Closet();
    /*****
    public static ArrayList<Jacket> allJackets = new ArrayList<Jacket>();
    public static ArrayList<Shirt> allShirts = new ArrayList<Shirt>();
    public static ArrayList<Pants> allPants = new ArrayList<Pants>();
    public static ArrayList<Shoes> allShoes = new ArrayList<Shoes>();
    *****/

    public static void main(String[] args) {

        // initialize jacket, shirts, pants, & shoes into ArrayList
        // this is user's closet
        myCloset.initalizeJackets();
        myCloset.initalizeShirts();
        myCloset.initalizePants();
        myCloset.initalizeShoes();


        //initalizeShirts();
        //initalizePants();
        //initalizeShoes();

        Suitcase ansuSuitcase = new Suitcase();
        Suitcase kellySuitcase = new Suitcase();
        Suitcase sueSuitcase = new Suitcase();

        initalizeSuitcase(ansuSuitcase);
        initalizeSuitcase(kellySuitcase);
        initalizeSuitcase(sueSuitcase);


        // print out the content of each closet
        System.out.println("Ansu suitcase has " + ansuSuitcase.showSuitcase());
        System.out.println("Kelly suitcase has " + kellySuitcase.showSuitcase());
        System.out.println("Sue suitcase has " + sueSuitcase.showSuitcase());


    }

/*****
    public static void initalizeJackets() {
        Jacket item = new Jacket("cotton", "blue", true,
                false, "2 buttons");
        allJackets.add(item);

        item = new Jacket("linen", "brown", true,
                false, "3 buttons");
        allJackets.add(item);

        item = new Jacket("polyester", "grey", true,
                false, "hood");
        allJackets.add(item);

        item = new Jacket("linen", "yellow", true,
                false, "no butons");


    }
****/

/***************
    public static void initalizeShirts() {

        Shirt item = new Shirt ("linen", "red", true, true, "uTshirt" );
        allShirts.add(item);

        item = new Shirt ("Denim", "white", true, true, "buttons" );
        allShirts.add(item);

        item = new Shirt ("Fur", "brown", true, true, "collarshirt" );
        allShirts.add(item);

        item = new Shirt ("cotton", "brown", true, true, "vTshrit" );
        allShirts.add(item);
    }

    public static void initalizePants() {
        Pants item = new Pants ("linen", "red", true, true, "jean");
        allPants.add(item);

        item = new Pants ("linen", "red", true, true, "sweat");
        allPants.add(item);

        item = new Pants ("linen", "red", true, true, "dress");
        allPants.add(item);
    }

    public static void initalizeShoes() {
        // heel, sneakers, sandles, dress, casual (default)
        Shoes item = new Shoes ("linen", "red", "heel");
        allShoes.add(item);

        item = new Shoes ("fur", "red", "sneakers");
        allShoes.add(item);


    }
*********************/




    public static void initalizeSuitcase (Suitcase tempSuitcase){
        //   ArrayList <Jacket> all_of_jackets = new ArrayList <Jacket>();
        // currently returns one item. add more items later on
        Random rand = new Random();
        int id1 = rand.nextInt(myCloset.getJacketNo());
        Jacket oneJacket = myCloset.getJackets(id1);
        tempSuitcase.setJacketItem(oneJacket);

        int id2 = rand.nextInt(myCloset.getShirtNo());
        Shirt oneShirt = myCloset.getShirt(id2);
        tempSuitcase.setShirtItem(oneShirt);

        int id3 = rand.nextInt(myCloset.getPantsNo());
        Pants onePants = myCloset.getPants(id3);
        tempSuitcase.setPantsItem(onePants);

        int id4 = rand.nextInt(myCloset.getShoesNo());
        Shoes oneShoe = myCloset.getShoes(id4);
        tempSuitcase.setShoesItem(oneShoe);

/************
        int id1 = rand.nextInt(myCloset.allJackets.size());
        Jacket oneJacket = allJackets.get(id1);
        tempSuitcase.setJacketItem(oneJacket);

        int id2 = rand.nextInt(allShirts.size());
        Shirt oneShirt = allShirts.get(id2);
        tempSuitcase.setShirtItem(oneShirt);

        int id3 = rand.nextInt(allPants.size());
        Pants onePants = allPants.get(id3);
        tempSuitcase.setPantsItem(onePants);

        int id4 = rand.nextInt(allShoes.size());
        Shoes oneShoe = allShoes.get(id4);
        tempSuitcase.setShoesItem(oneShoe);

 *****************/
    }

}

