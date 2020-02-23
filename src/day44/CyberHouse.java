package day44;

public class CyberHouse {
    int houseNum ;
    String design;
    public static String neighbourhoodName="Brooklyn";

    //CONSTRUCTOR
    public CyberHouse(int houseNum, String design) {
        this.houseNum = houseNum;
        this.design = design;

    }

    //instance method can access anything
    public void showAllInfo (){
        System.out.println("houseNum = "+houseNum+ ", design = "+design+", neighbourhoodName = "+neighbourhoodName);
    }

    //Static method can only access static members of same class
    public static void showNeighbourhood (){
        System.out.println("neighbourhood =" + neighbourhoodName);
    }

}
