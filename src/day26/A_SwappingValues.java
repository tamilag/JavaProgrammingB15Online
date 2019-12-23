package day26;

import java.util.Arrays;

public class A_SwappingValues {
    public static void main(String[] args) {

  String name1="Emma";
        String name2="Jason";
        //name2 should have Emma, name 1 should have Jason
        // create a temp container for name 1
        String tempContainer = name1;
        name1=name2;
        name2=tempContainer;
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);



        int [] myNumbers =new int []{10,40,30,7};
        int temp = myNumbers[0];
        myNumbers[0]=myNumbers[3];
        myNumbers[3]=temp;
        System.out.println("first item value: "+myNumbers[0]);
        System.out.println("last item value: "+myNumbers[3]);

        ///swap 30 and 40
        int temp2=myNumbers[1];
        myNumbers[1]=myNumbers[2];
        myNumbers[2]=temp2;
        System.out.println("myNumbers: = " + Arrays.toString(myNumbers));



















    }
}
