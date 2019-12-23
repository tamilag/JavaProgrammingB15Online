package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String hero1="Superman-Clark Kent";
        //task: Hero code is Superman and identity is Clark Kent
        //The initial of the Hero is CK
        //logic 1: split by dash to get two pieces
        String[] heroSplit = hero1.split("-");
        System.out.println("Arrays.toString(heroSplit) = " + Arrays.toString(heroSplit));
        System.out.println("Hero code is "+heroSplit[0]+" and Identity is "+heroSplit[1]);
        //The initials of hero CK
        //logic: split by space and use
        //get the first letter of the full name and get 1 letter after the space and concatenate them
        //downside is : what if we have middle name
        //solution: instead of looking for the last index of the space then get the next Character
        //logic2 We already have full name, split it by space, get F and L names
        //get the first letter of full name
        //then get the last item index
        //get the first character and concatenate
        String fullName = heroSplit[1];
        String[] fullNameSplit = fullName.split(" ");
        System.out.println("fullNameSplit = " + Arrays.toString(fullNameSplit));
        // last name will be always the last element of split full name
        // no matter the name has middle name or not
        String lastName = fullNameSplit[fullNameSplit.length - 1];
        System.out.println("lastName = " + lastName);
        System.out.println("Initial of the hero is : " + fullName.charAt(0) + lastName.charAt(0));

        
        
        
        
        
        
        
        
        
        
        
        
    }
}
