package day15;

public class SubstringPractice {
    public static void main(String[] args) {
                     //0123456789012345
        String movie ="Lord Of The Ring";
        //get "of" out of the string
        String wordOf=movie.substring(5,7);
        //substring from beginning index until right before ending index not including
        System.out.println(wordOf);
        String wordThe=movie.substring(8,11);
        System.out.println(wordThe);

        //get everything you have from the second word till last word, how to find out where is the second word
        //it starts after the first space
        //logically: find out first space index, second word start after first space, it's a starting point
        //my ending point is the last index
        int startingPoint=movie.indexOf(" ")+1;
        int endingPoint=movie.length();
        System.out.println(movie.substring(startingPoint,endingPoint));
        String secondWordTillLast=movie.substring(5,16);
        System.out.println(secondWordTillLast);
        String wordLordOf=movie.substring(0,7);
        System.out.println(wordLordOf);
        //if you provide only one parameter to substring method, it will just start from that location and get till the end
        String secondToLast=movie.substring(5);
        System.out.println(secondToLast);

        //reverse Lord Of The Ring >> Ring Of The Lord knowing the index already
        String ring=movie.substring(12);
        String ofThe=movie.substring(4,12);
        String lord=movie.substring(0,4);
        System.out.println(ring+" "+ofThe+" "+lord);

        System.out.println(movie.substring(12)+movie.substring(4,12)+movie.substring(0,4));
        //System.out.println(" ");
        //System.out.println(movie.substring(12)+" "+movie.substring(5)+" "+movie.substring(8)+" "+movie.substring(0));

        //turn it to "Ring of The Java Lord"
        System.out.println(ring+ofThe+"Java "+lord);



























    }
}
