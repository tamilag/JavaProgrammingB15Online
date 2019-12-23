package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {
        //           01234567890123456789012345
        String name="I love Java I love Java Java Java";
        //get the second Java word
        //assume you already know there is 4 Java in the sentence
        //second Java means - Java showed up after first Java
        //first find out where is location of the first Java
        //instead of searching from the beginning, search from right after you found first Java
        //then it will give you the index of second Java
        //how do i start from different location when using indexOf
        //because index always start from the beginning
        //indexOf method has 2 version 1 expect 1 external data
        //another expect 2 external data>> yourString.indexOf()

        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java",7));
        System.out.println(name.indexOf("Java", 8));
        System.out.println(name.indexOf("Java",9));
        System.out.println(name.indexOf("Java",19));
        System.out.println(name.indexOf("Java",20));
        int firstJavaLocation=name.indexOf("Java");
        System.out.println(firstJavaLocation);
        int startingPointToSearchSecondJava=firstJavaLocation+4; //+4 because we know it's 4 letters
        System.out.println(startingPointToSearchSecondJava);
        int secondJavaLocation=name.indexOf("Java", startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);
        int thirdJavaLocation=name.indexOf("Java",secondJavaLocation+4);
        System.out.println("thirdJavaLocation = " + thirdJavaLocation);
        //if we don't know the length of the word >> word.length()
        //I do not know how many words in this sentence, I only know there are 3+ words
        //I want to know what is the second word
        int firstSpace=name.indexOf(" ");
        int secondSpace =name.indexOf(" ", firstSpace+1);
        System.out.println("Second word is "+name.substring(firstSpace+1,secondSpace));


























    }
}
