package day36;

public class E_MethodPractice {
    public static void main(String[] args) {

        Boolean b = true; //auto-boxed into Boolean Object
        Boolean result1=checkIfStringHasNumber("ytzn9fsdrg");
        System.out.println("result1 = "+result1 );

        //we also can use this method without delcaring Boolean object
        System.out.println(checkIfStringHasNumber("abf"));

    }

    /* write a static void method to accept a long array.
     * It should swamp first value with last value of the array
     * Optionally write a static void method to reverse an int array
     * @param str
     * @return
     */
    public static Boolean checkIfStringHasNumber (String str){
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if(Character.isDigit(eachChar)){
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);

    }
}
