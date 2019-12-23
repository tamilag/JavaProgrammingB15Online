package day13;



public class IfYouWantToSaveMethodYouAppliedToObject {
    public static void main(String[] args) {
        String spouseName="Jakhongir";
        System.out.println(spouseName);
        spouseName="Tamila";
        System.out.println(spouseName);

        String name="Pumpkin";
        name.toUpperCase();
        System.out.println(name); //doesn't change to all capital because OBJECT CANNOT BE CHANGED EVERY TIME
        //YOU APPLY A METHOD TO IT, STRING IS IMMUTABLE
        //WHAT IF YOU WANT TO SAVE THE METHOD YOU APPLIED
        name=name.toUpperCase();
        System.out.println(name);














    }


}
