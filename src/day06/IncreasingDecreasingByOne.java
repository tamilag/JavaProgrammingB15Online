package day06;

public class IncreasingDecreasingByOne {
    public static void main(String[] args) {
//initializing value offercount value to 2
    int offerCount=2;
    //increasing the number by one using regular way:
    //offerCount=offercount+1;
    //increasing the number by one using compound/shorthand operator
     offerCount +=4;
    //Shorter shortcut for this operation, EXCLUSIVELY INCREASING/DECREASING BY 1
    //    ++ offerCount;
        System.out.println("Offer is " + offerCount);
        --offerCount;
        System.out.println("And now "+offerCount);

    }
}
