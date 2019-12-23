package day23;

public class Array {
    public static void main(String[] args) {
//  create an int array of 7 items
//  assign values
// 1,  print out in reverse order
// 2 , store last item in a variable called lastItem
// print it out separately
// 3 , print the item right in the middle
//
// OPTIONALLY : find sum , find average , find max , find min

        int[] numbers = new int[]{11, 2, 34, 4, 53, 6, 3};
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " >> ");
        }
        System.out.println();
        int arraySize=numbers.length;
        int lastItemIndex=arraySize-1;
        System.out.println("Last Item Value "+numbers[lastItemIndex]);
       // System.out.println(numbers[numbers.length/2+1]);
        int middleItemValue=arraySize/2;
        System.out.println("Middle item value: "+middleItemValue);
        int sum=0;
        for (int i = 0; i <arraySize ; i++) {
            int currentItem=numbers[i];
            sum=sum+currentItem; //sum+=num[i]
        }
        System.out.println("Sum is: "+sum);


















    }
}
