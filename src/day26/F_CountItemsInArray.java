package day26;

import java.util.Arrays;

public class F_CountItemsInArray {
    public static void main(String[] args) {
        String[] marvelHeros = {"Iron Man", "Captain America", "Spiderman",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spiderman",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heroes = " + Arrays.toString(marvelHeros));
        int sizeOfArray=marvelHeros.length;
        System.out.println("Heroes count= " + sizeOfArray);
        String itemToSearch="Superman";
        int countOfItem = 0;

        for (String eachHero:marvelHeros) {
            if (eachHero.equals(itemToSearch)){
                countOfItem++;
            }
        }
        System.out.println("countOfItem = " + countOfItem);
        
        //another task Count the heroes with the word "black"
        int cntOfBlack=0;
        for (String eachHeroName:marvelHeros) {
            if (eachHeroName.toLowerCase().contains("black")){
                cntOfBlack++;
            }
        }
        System.out.println("cntOfBlack = " + cntOfBlack);















    }
}
