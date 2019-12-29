package day33;

import org.w3c.dom.ls.LSOutput;

public class E_BirthYearAgeCalculator {
    public static void main(String[] args) {

        System.out.println(calculateAgeFromBirthYear(1899));
    }
    /*create method calculateAndReturnAge
    write a code that accepts a birth year and return the age
    the birth year should be within range 1900-2020
    if not return 0
     */

    public static int calculateAgeFromBirthYear (int birthYear){

        if (!(birthYear>=1900 && birthYear<=2020)){
           return 0;
        }
        return 2019-birthYear;
    }
}

//RETURN KEYWORD IS USED TO RETURN A VALUE OUT OF METHOD
//IT IS ALSO USED TO GET OUT OF YOUR METHOD