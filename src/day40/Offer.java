package day40;

public class Offer {
    String location , company;
    long salary ;
    boolean isFullTime;


    /*
    this is an instance method to print all the info about offer object
    no parameter and no return type
     */
    public void displayInfo (){
        //inside instance method we can directly access instance variable
        System.out.println("Location = "+location);
        System.out.println("Company = "+company);
        System.out.println("Salary = $"+salary);
        System.out.println("Full time = "+isFullTime);


    }

    //write a method called turnToFullTime
    public void turnToFullTime () {
        if (isFullTime==false){
            isFullTime = true;
        }else{
            System.out.println("Already full time!");
        }

    }

    //Write a method to change the location of the offer to the location user pass
    public void changeLocation (String newLocation){
        location=newLocation;
    }

    //Write a method to accept 4 parameter to change all info
    //about offers

    public void changeAllInfo (String newCompany, String newLocation, long newSalary, boolean newIsFullTime ){
        company=newCompany;
        location=newLocation;
        salary=newSalary;
        isFullTime=newIsFullTime;
        //THIS METHOD APPLIED IN OFFERACTIONS3
        //an instance method can use any instance fields
        displayInfo();
    }
    //write a method to check if the offer belong to 100K club

    /**
     * method to check the office belong to 100K club
     * @return true if salary is more than 100K, false if not
     */
    public boolean is100KOffer (){
        //salary>=100000 already generate a boolean result
        return salary>100000;
    }
    //create an instant method called toString
    //has no parameter
    //return String representation of Offer Object
    //in bellow format
    //[location = Virginia , Company = Amazon | Salary = $150000 | isFullTime = true]

    public String toString () {
        String stringFormat = ("Location = "+location + " |  Company = "+company+" | Salary = "+salary+" | Is Full Time = "+isFullTime);
        return stringFormat;
    }




























}
