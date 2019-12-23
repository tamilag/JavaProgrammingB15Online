package day27;

public class ArraysReview2 {
    public static void main(String[] args) {

        //TASK: write a program that can find minimum number for an array, do not use sort method
        int [] scores = {10, 897, 654, 32, 1231, 224, 556, 7, 1, 2, 3, 4};
        int min=999999999;
        for (int i = 0; i < scores.length; i++) {
            if (min>scores[i]){
                min=scores[i];
            }
        }
        System.out.println(min);

        //TASK: write a program that can find second minimum number

        int secondMin=scores[0];
        for (int x = 0; x < scores.length; x++) {
            if (scores[x] == min){
                continue;
            }
            if (secondMin>scores[x]){
                secondMin=scores[x];
            }
        }

        //TASK: write a program that
        int thirdMin = scores[0];
        for(int i = 0; i < scores.length; i++){
            /*
            if(scores[i] == min || scores[i] ==secondMin){
                continue;
            }
             */
            if(thirdMin >scores[i] && scores[i] != min && scores[i] !=secondMin){
                thirdMin = scores[i];
            }
        }
        System.out.println("third minimum number is: "+thirdMin);

            /*
        Task02: write a program that returns the maximum number from an array
                    do not use sort method
         */
            int[] nums = {100, 10000, 9999, 8888, 1231, 2345};
            int max = nums[0]; //max: 10000
            for(int i =0; i < nums.length; i++){
                if(max < nums[i]){
                    max = nums[i];
                }
            }
            System.out.println("first max number: "+max);
            int secondMax = nums[0];
            for(int i =0; i < nums.length; i++){
                if(secondMax <  nums[i] && nums[i] != max){
                    secondMax = nums[i];
                }
            }
            System.out.println("second max number: "+secondMax);

























        }
}
