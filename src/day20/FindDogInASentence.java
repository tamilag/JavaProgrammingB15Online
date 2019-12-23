package day20;



public class FindDogInASentence {
    public static void main(String[] args) {

        //given a sentence, find the location of the "dog"
        String msg = "I like my dog, dogs are cute";
        //our approach is going thru the sentence 3 characters at a time
        // then if any of the 3 characters happen to be a dog, we print out the index
        //1234567890123456789012345678
        //I like my dog, dogs are cute
        int lastCharIndex = msg.length() - 1;
        System.out.println(msg.length());
        for (int x = 0; x <= lastCharIndex - 2; x++) {
            String current3chars = msg.substring(x, x + 3);
            System.out.println(x + " : " + current3chars);
            if (current3chars.equals("dog")) {
                System.out.println("Bingo!!! At " + x);

            }


        }


    }
}