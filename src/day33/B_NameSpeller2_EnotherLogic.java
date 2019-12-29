package day33;

import org.w3c.dom.ls.LSOutput;

public class B_NameSpeller2_EnotherLogic {
    /*keep adding dash until character before last
    and concatenate the last character
     */
    public static void main(String[] args) {
        System.out.println(getSpelledNameP("Kotyunya"));
    }
    public static String getSpelledNameP(String name){
        String result ="";
        for (int i = 0; i < name.length() -1 ; i++) {
        result+=name.charAt(i)+"-";
            }

        return result+name.charAt(name.length()-1); //we added this not to see the error

    }
}
