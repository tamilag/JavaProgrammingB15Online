package day36;

import java.util.Arrays;

public class D_MethodWithParameter {
    public static void main(String[] args) {
        int [] nums = {1, 5, 3, 4, 7, 2};
        System.out.println("array before sort = "+Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("array after sort = "+Arrays.toString(nums));

        System.out.println("array before method applied = "+Arrays.toString(nums));
        changeArrayFirstItemTo100(nums);
        System.out.println("array after method applied = "+Arrays.toString(nums));

        //WHEN YOU PASS A VARIABLE TO A METHOD PARAMETER:
        //YOU ARE ONLY PASSING THE COPY OF THE VARIABLE
        //FOR PRIMITIVE -> THE COPY HOLDS THE VALUE ITSELF,
        //CHANGING THE VALUE DOESN'T CHANGE THE ORIGINAL VALUE THAT PASSES
        //FOR REFERENCE -> THE COPY HOLDS THE ADDRESS OF THE OBJECT
        //CHANGING THE VALUE WILL AFFECT ORIGINAL OBJECT
        //INT [] NUMBER = NUMS;
        //
    }

    public static void changeArrayFirstItemTo100 (int [] numbers){
        numbers[0]=100;

    }
}
