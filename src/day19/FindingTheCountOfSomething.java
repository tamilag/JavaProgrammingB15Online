package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        //print out all the numbers from 1-100 that can be divided by 15
        //count how many numbers can be divided by 15
        int count =0;
        for (int i = 1; i <= 100; i++) {
            if (i%15==0){
                System.out.println(i);
                ++count;
            }
        }
        System.out.println("count is "+count);

        //given a string with value, find out how many 'a' showed in this string
        String name="Esra Fidan";
        int countOfA=0;
        for (int x = 0; x < name.length(); x++) {

            System.out.println(name.charAt(x));
            if (name.charAt(x)=='a'){
                System.out.println("Bingo, Found it!");
                ++countOfA;
                
            }
        }
        System.out.println("countOfA = " + countOfA);















    }
}
