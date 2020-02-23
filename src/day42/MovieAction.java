package day42;

public class MovieAction {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        System.out.println("m1 = " + m1);

        Movie m2 = new Movie("Joker", 2.2, "Dramma");
        Movie m3 = new Movie("The Village", 2.1, "M. Night Shyamalan");

        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);

        // I WANT TI GET THE NAME OF M2 SEPARATELY SO I CAN DO SOME STUFF
        //I CANNOT ACCESS THE FIELD DIRECTLY BECAUSE IT'S PRIVATE
        //I NEED A GETTER METHOD TO ACCESS

        System.out.println(m2.getName());
    }
}
