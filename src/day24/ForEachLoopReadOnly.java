package day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {
        int yourFavNumber=300;
        int myFavNumber=yourFavNumber;
        myFavNumber=299;
        System.out.println(yourFavNumber);

       long [] nums={10,40,20};
        //how do i double my first item in the array
//        nums[0]=nums[0]*2; // nums[0}*=2;
//        System.out.println(nums[0]);
        for (int i = 0; i < 3; i++) {
            System.out.print(nums[i]*2+" ");
        }
        System.out.println();
        //how do i know if array items are modified or not, just reprint them
        for (int x = 0; x < 3 ; x++) {
            System.out.print(nums[x]+" ");
        }
        //after you reprint, you see that value of array was not changed
        // it changed only when you printed them multiplying to 2

        for (int y = 0; y < 3; y++) {
            long eachItem = nums[y];
            eachItem = 100;
            System.out.println(eachItem);
        }
        for (long eachItem:nums) {
            eachItem=100;
        }
        //NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS, IT'S NOT GOING TO CHANGE
    }
}
