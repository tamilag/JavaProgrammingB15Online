package day40;

public class OfferActions4 {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.company="Apple";
        offer1.location="Austin";
        offer1.isFullTime= false;
        offer1.salary=140000;
        offer1.displayInfo();

        System.out.println("======= ToString Method ========");
        offer1.toString();
        System.out.println(offer1.toString());

        //if you directly print out object , it will call toString() method automatically
        //because your class has it, and no hash code is going to be printed
        //if you take out toString Method , hash code will be printed


    }

}
