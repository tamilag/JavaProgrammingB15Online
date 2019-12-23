package day20;

public class WorkingWithMoreThanOneCharString {
    public static void main(String[] args) {
        //given a String with even number character count
        //print 2 characters in one line
        //            012345
        //for example Tamila
        /*
        Ta 01
        mi 23
        la 45
         */
        String name="Tamila";
        System.out.println(name.substring(0,2));
        System.out.println(name.substring(2,4));
        System.out.println(name.substring(4,6));

//        int x=0;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
       //my condition is x<=charCount-2
        int charCount=name.length();
        int lastCharIndex=charCount-1;
        for (int x=0; x<=charCount-2;x+=2){
            System.out.println(name.substring(x, x+2));
        }





















    }
}
