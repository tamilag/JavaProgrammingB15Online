package day33;

public class A_NameSpeller {
    public static void main(String[] args) {
        System.out.println(getSpelledNameP("Jojoshka"));
    }

    /*
    getSpelledNAme
    This method will put dash in between
     */

    public static String getSpelledNameP(String name){
        String result ="";
        for (int x = 0; x < name.length() ; x++) {
            result= result+name.charAt(x);
            //contcatinate dash if we are not at last character
            if (x!=name.length()-1){
                result=result+"-";
            }
        }
        return result; //we added this not to see the error

    }







}
