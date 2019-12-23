package day20;

import java.util.Scanner;

public class Repl88CatAndDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        //            012345
        String word= scan.next();
        //            123456
        int charCount=word.length();
        int indexCount=charCount-1;
        //check every 3 characters, if it contains cat, add to cat count +1
        //if it contains dog, add to dog count +1
        for (int i = 0; i <=indexCount-2 ; i++) {
            String cur3Chars=word.substring(i, i+3);
            if (cur3Chars.equals("cat")){
                countOfCats++;
            }else if (cur3Chars.equals("dog")){
                countOfDogs++;
            }
        }
        if (countOfCats==countOfDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }




















    }
}