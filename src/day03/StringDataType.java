package day03;

public class StringDataType {
    public static void main(String[] args) {
        String name="TamTam";
        System.out.println(name);
        System.out.println("I have a very beautiful name. It's "+name);
        String city="New York";
        int yearsInAmerica=4;
        float height=5.6f;
        char currency='$';
        boolean cold=true;
        short ticketprice=600;
        byte people=2;
        System.out.println("Hey! My name is "+name+" , and I am "+ height+ ". I was born in Tashkent, " +
                "but now I live in "+city+" for "+yearsInAmerica+" years already. My salary is "+currency+"500. \n" +
                "Recently I went to Tashkent, the ticket cost me "+currency+ticketprice+". The Weather Channel " +
                "informed us that's cold outside. It is "+cold+". There are "+people+" of us in the room.\nLesson is over.");



    }
}
