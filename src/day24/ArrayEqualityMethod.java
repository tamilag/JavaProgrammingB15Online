package day24;

import java.util.Arrays;

public class ArrayEqualityMethod {
    public static void main(String[] args) {
        int [] scores1={2,5,6,7,3,34,6};
        int [] scores2={22,45,6,37,3,6,9};
        int [] scores3={2,5,6,7,3,34,6};
        //if we rearrange the order of array objects that have the same content, it will not be equal
        int [] scores4={2,6,5,7,3,34,6};
        System.out.println(scores1==scores2);//--> false
        System.out.println(scores1==scores3); //--> false
        boolean isS1S2Equals= Arrays.equals(scores1,scores2);
        System.out.println("is score1 has the same content as score2 "+isS1S2Equals); // -->> false
        boolean isS1S3Equals= Arrays.equals(scores1,scores3);
        System.out.println("is score1 has the same content as score3 "+isS1S3Equals); // -->> true
        boolean isS3S4Equals= Arrays.equals(scores3,scores4);
        System.out.println("is score3 has the same content as score4 "+isS1S3Equals); // -->> false



















    }
}
