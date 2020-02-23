package day35;

public class D_ParseValueOf {
    public static void main(String[] args) {
        float f6=Float.parseFloat("3.14");
        System.out.println(f6);
        //-----------TASK-------------
        String sentence="I bought 3 tomato and the price was 3.14 each";
        //how much is your tomato purchase?
        //the count is always 3rd word, the price is always at 2nd index from last word

        String [] sentenceSplit=sentence.split(" ");
        int count = Integer.valueOf(sentenceSplit[2]);
        System.out.println(count);
        double price = Double.parseDouble(sentenceSplit[sentenceSplit.length-2]);
        System.out.println("total price "+count*price);


    }
}
