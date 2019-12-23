package day11;

public class LogicalOrOperator {
    public static void main(String[] args) {
/*   ||  2 pipe  or  | 1 pipe is used for compiling 2 conditions  : Logical  OR Operator
        If you have 2 conditions to check
        When will this be true  :  As long as one side is true , whole result will be true
        think about buying milk from 2 stores :
        As long as you found the milk in one store , you got the milk then you get out !
                How do I type  pile character on keyboard   |   —>> shift \
        As long as one side is true   whole result will be true
                         true        false
        int x = 70 ;     x>10   ||   x < 5      —>> true
                         false      false
        int x = 7 ;     x>10   ||   x < 5      —>> false
                          true      false
        int x = 17 ;     x>10   ||   x < 5      —>> true
                          false        true
        int x = -8 ;     x>10   ||   x < 5      —>> true
*/
    //create a int var called num
    //find out whether it's >100 or less than 10
    //find out if the number is within the range 10-60
    //and print out the result

    //check if x is more than 50 and is not equal 52 or x equal to 57
        int x=55;
        System.out.println(x>50 && x!=55 || x==55);
        System.out.println(5>10 && 9/0==3);
        System.out.println(5>10 & 9/0==3); // 9/0==3 is wrong arithmetic operation, that's why it will give error




}
}
