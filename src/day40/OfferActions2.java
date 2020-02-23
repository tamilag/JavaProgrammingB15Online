package day40;

import java.lang.constant.DynamicCallSiteDesc;
import java.util.ArrayList;

public class OfferActions2 {
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

        Offer offer3=new Offer();
//        offer3.company="Amazon";
//        offer3.location="Austin";
//        offer3.isFullTime= true;
//        offer3.salary=96000;
//        offer3.displayInfo();


        //add 2K to the amazon offer
        offer2.salary=offer2.salary+2000;
        offer2.salary+=2000;
        System.out.println("new amazon salary = "+offer2.salary);
        //set the salary value of offer3 offer object to sum of all the offers
        offer3.salary=offer1.salary+offer2.salary;
        System.out.println("offer 3 salary is = "+offer3.salary);
        //turn offer3 to full time
        System.out.println("turn offer3 to full time");
        offer3.displayInfo();
        offer3.turnToFullTime();
        offer3.displayInfo();

        //change location from null to new location to offer 4
        offer3.changeLocation("DC");
        offer3.displayInfo();

    }

}
