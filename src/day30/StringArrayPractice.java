package day30;

public class StringArrayPractice {
    public static void main(String[] args) {
String carInventory []=new String[] {"Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "Oldsmobile-Achieva",
                "Honda-Civic"};

//count how many chevrolet in arrays, how many civics
        int chevy=0;
        int civic=0;
        for (String eachCar:carInventory) {
            if(eachCar.toLowerCase().startsWith("chevrolet")){
            chevy+=1;
            }else if(eachCar.toLowerCase().contains("civic")){
            civic+=1;
            }
        }
        System.out.println("Number of Chevrolets: "+chevy);
        System.out.println("Number of Civics: "+civic);


















    }
}
