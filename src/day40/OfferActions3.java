package day40;

public class OfferActions3 {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.company="Apple";
        offer1.location="Austin";
        offer1.isFullTime= false;
        offer1.salary=140000;
        offer1.displayInfo();

        System.out.println("======== Methods Applied : TurnToFullTime & ChangeLocation ========");
        offer1.turnToFullTime();
        offer1.turnToFullTime();
        offer1.changeLocation("New York");
        offer1.displayInfo();

        System.out.println("=========  Change All Info Method Applied =========");
        offer1.changeAllInfo("Equifax", "San Francisco", 160000, true);
        //offer1.displayInfo();  COMMENTED OUT BECAUSE WE CALLED THIS METHOD INSIDE CHANGEALLINFO METHOD

        System.out.println("if this guy earn more than 100K, move him to Atlanta");
        //boolean result =offer1.is100KOffer();
        //if (result == true) {
        if (offer1.is100KOffer()){
            offer1.changeLocation("Atlanta");
        }
        offer1.displayInfo();

        System.out.println("======= ToString Method ========");
        offer1.toString();
        System.out.println(offer1.toString());

        //if you directly print out object , it will call toString() method automatically


    }

}
