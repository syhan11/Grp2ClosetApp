import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ClosetApp {

    public static Closet myCloset = new Closet();
    public static void main(String[] args) {

        // initialize jacket, shirts, pants, & shoes into ArrayList
        // this is user's closet
        myCloset.initalizeJackets();
        myCloset.initalizeShirts();
        myCloset.initalizePants();
        myCloset.initalizeShoes();

        // randomly fill suitcases
        Suitcase ansuSuitcase = new Suitcase();
        Suitcase kellySuitcase = new Suitcase();
        Suitcase sueSuitcase = new Suitcase();

        initalizeSuitcase(ansuSuitcase);
        initalizeSuitcase(kellySuitcase);
        initalizeSuitcase(sueSuitcase);

        // ask user for suitcase choice

        Scanner keyboard = new Scanner(System.in);
        boolean cont = true;
        String msg;

        do {
            System.out.println("There are Ansu's, Kelly's, and Sue's suitcases. Which suitcase would you like to see?");
            System.out.println("Type \"Ansu\", \"Kelly\", or \"Sue\".");
            msg = keyboard.nextLine();
            switch (msg) {
                case "Ansu":
                case "ansu":
                    System.out.println("Ansu suitcase has " + ansuSuitcase.showSuitcase());
                    break;

                case "Kelly":
                case "kelly":
                    System.out.println("Kelly suitcase has " + kellySuitcase.showSuitcase());
                    break;

                case "Sue":
                case "sue":
                    System.out.println("Sue suitcase has " + sueSuitcase.showSuitcase());
                    break;

                default:
                    System.out.println("Unknown choice: " + msg);
                    break;
            }

            System.out.println("Would you like to continue (Y/N)?");
            msg = keyboard.nextLine();
            if (msg.equalsIgnoreCase("n"))
                cont = false;

        } while (cont);

 }


    public static void initalizeSuitcase (Suitcase tempSuitcase){

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

    }

}

