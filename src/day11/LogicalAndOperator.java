package day11;

public class LogicalAndOperator {
    public static void main(String[] args) {
        // LOGICAL OPERATOR - combining multiple condition together
        //in JAVA there is no range check directly like in math
        //for example int x=70
        //in math: 60 < x < -->> true < 100
        // in JAVA : x > 60 && x<100
        // && 2 ampersand & 1 ampersand--->> logical "AND" operator
        // && 2 ampersand  & 1 ampersand   -->> Logical AND operator
        // This is used to check both conditions are true at the same time
        // Think about login example
        // only when your username is right and your password is right at the same time
        // then you will be able to login
        /*                  true       true
        * int x = 70 ;    x > 60  && x <100 ;  true
                            false      true
        * int x = 10 ;    x > 60  && x <100 ;  false
                           true       false
        *int x = 110 ;   x > 60  && x <100 ;  false
                            true       true
        *int x = 99 ;    x > 60  && x <100 ;  true
        */
        System.out.println("True Table");
        System.out.println("Result of true&&true is " +(true&&true));
        System.out.println("Result of true&&true is " +(true&&false));
        System.out.println("Result of true&&true is " +(false&&true));
        System.out.println("Result of true&&true is " +(false&&false));

    }
}
