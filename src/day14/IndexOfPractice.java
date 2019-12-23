package day14;

public class IndexOfPractice {
    public static void main(String[] args) {
        //indexOf
        //find out the location of Java
        //find out the location of letter o and O
        //find out the location of first space
        //             012345678901
        String name = "Game of Java";
        System.out.println(name.indexOf("Java"));
        System.out.println(name.length());
        System.out.println(name.indexOf("o"));
        System.out.println(name.indexOf("O"));
        System.out.println(name.indexOf(" ")); //it will always give the first space

        //find out the last location the letter A shows up
        //find out the last location of last space
        //find out last location the letter Ga shows up
        //find out last location of Kawa
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf(" "));
        System.out.println(name.lastIndexOf("Ga"));
        System.out.println(name.lastIndexOf("Kawa"));

        //if i don't use contains method, what would be my condition to check whether we have Kawa in this String
        //either using indexOf or last index
        if (name.indexOf("Kawa")>-1){
            System.out.println("Kawa found");
        }else{
            System.out.println("No Kawa");
        }





















    }
}
