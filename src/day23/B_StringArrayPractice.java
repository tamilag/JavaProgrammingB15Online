package day23;

public class B_StringArrayPractice {
    public static void main(String[] args) {
        String [] shows={"Orville", "Gifted", "Game of Thrones", "flash", "Arrow", "Super girl"};
        int showsCount=shows.length;
        System.out.println("showsCount = " + showsCount);
        for (int x = 0; x <showsCount ; x++) {
//            String currentShow=shows[x];
//            System.out.println(currentShow + " has character count "+currentShow.length() );
            System.out.println(shows[x]+" has character count: "+shows[x].length());
        }






















    }
}
