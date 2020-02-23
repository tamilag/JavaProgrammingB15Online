package day40;

import java.util.ArrayList;

public class OfferActions {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.company="Apple";
        offer1.location="Austin";
        offer1.isFullTime= true;
        offer1.salary=140000;
        offer1.displayInfo();

        Offer offer2=new Offer();
        offer2.company="Amazon";
        offer2.location="Austin";
        offer2.isFullTime= true;
        offer2.salary=96000;
        offer2.displayInfo();


        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(offer1);
        myOffers.add(offer2);
        System.out.println("my offers = " + myOffers);
        for (Offer eachOffer: myOffers ) {
            eachOffer.displayInfo();
        }

        for (int i = 0; i < myOffers.size() ; i++) {
            //store each item to a variable each
            Offer each = myOffers.get(i);
            each.displayInfo();
            myOffers.get(i).displayInfo();
        }
    }
}
